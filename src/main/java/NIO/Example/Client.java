package NIO.Example;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class Client {
    public static void main(String[] args) throws IOException {
        SocketChannel sc = SocketChannel.open();
        sc.connect(new InetSocketAddress(8888));
        ByteBuffer buffer = ByteBuffer.allocate(49);
        String str = "dummy string";
        buffer.put(str.getBytes());
        sc.write(buffer);
    }
}
