package NIO.Example;

import java.io.IOException;
import java.nio.channels.SocketChannel;

public class Acceptor implements Runnable {

    private NIOEndpoint endpoint;

    public Acceptor(NIOEndpoint endpoint){
        this.endpoint = endpoint;
    }

    @Override
    public void run() {
        while(true){
            SocketChannel socket = null;
            try{
                socket = endpoint.serverSocketAccept();
            }catch (IOException e){

            }

            endpoint.setSocketOptions(socket);
        }
    }
}
