package NIO.Example;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * 1.Start Acceptor thread
 * 2.Start poller thread
 */
public class NIOEndpoint {
    private Acceptor acceptor;
    private ServerSocketChannel serverSock;
    private Poller poller = null;


    public NIOEndpoint() throws Exception {
        serverSock = ServerSocketChannel.open();
        serverSock.bind(new InetSocketAddress(8888));
        serverSock.configureBlocking(true);

    }

    public void startAcceptorThread() {
        acceptor = new Acceptor(this);
        Thread t = new Thread(acceptor);
        t.start();
    }

    public void startPollerThread() throws IOException {
        poller = new Poller();
        Thread t = new Thread(poller);
        t.start();
    }

    protected SocketChannel serverSocketAccept() throws IOException {
        return serverSock.accept();
    }

    /**
     * Process the specified connection.
     * Add the new SocketChannel into the Queue
     */
    public void setSocketOptions(SocketChannel socket) {
        //acceptor accepted a connection from a client and created a client socket
        //So register the socket into selector
        try {
            socket.configureBlocking(false);
            poller.register(socket);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
