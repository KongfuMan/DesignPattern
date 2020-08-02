package NIO.Example;

import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.concurrent.*;

public class Poller implements Runnable {
    private Selector selector;
    private final ConcurrentLinkedQueue<SocketChannel> events =
            new ConcurrentLinkedQueue<>(); // socket cache

    public Poller() throws IOException {
        selector = Selector.open();
    }

    public void register(SocketChannel sc){
        events.offer(sc);
    }


    @Override
    public void run() {
        int keyCount = 0;
        while(true){
            boolean hasEvents = false;
            try {
                //从SocketChannel Queue中取出socket, 然后注册READ event到selector上面
                hasEvents = events();
                keyCount = selector.selectNow();
            }catch (IOException e){

            }

            Iterator<SelectionKey> iterator =
                    keyCount > 0 ? selector.selectedKeys().iterator() : null;

            while (iterator != null && iterator.hasNext()) {
                SelectionKey sk = iterator.next();
                //创建新的线程来处理该socket
                processSocket(sk);
            }
        }
    }

    /**
    * consumes the socket channel from the queue.
    *
    * */
    private boolean events(){
        boolean result = false;
        SocketChannel sc = null;
        for (int i = 0, size = events.size(); i < size && (sc = events.poll()) != null; i++ ) {
            result = true;
            try {
                sc.register(selector, SelectionKey.OP_READ);
            } catch (ClosedChannelException e) {
                e.printStackTrace();
            }
        }
//        if (running && !paused && eventCache != null) {
//            pe.reset();
//            eventCache.push(pe);
//        }
        return result;
    }

    public void processSocket(SelectionKey sk){
        SocketProcessor sc = createSocketProcessor(sk, SocketEvent.OPEN_READ);
        Executor executor = new ThreadPoolExecutor(5, 10, 5, TimeUnit.SECONDS,
                new LinkedBlockingQueue<Runnable>());
        executor.execute(sc);
    }


    protected SocketProcessor createSocketProcessor(SelectionKey sk, SocketEvent event){
        SocketChannel sc = (SocketChannel) sk.channel();
        return new SocketProcessor(sc, event);
    }
}
