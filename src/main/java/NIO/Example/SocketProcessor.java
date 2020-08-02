package NIO.Example;

import java.nio.channels.SocketChannel;

public class SocketProcessor implements Runnable{
    protected SocketChannel sc;
    protected SocketEvent event;

    public SocketProcessor(SocketChannel sc, SocketEvent event){
        this.sc = sc;
        this.event = event;
    }

    @Override
    public void run() {

    }
}
