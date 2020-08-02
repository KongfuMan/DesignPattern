package NIO.StudyChannel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOFileChannelWrite2File {
    public static void main(String[] args) throws IOException {
        String str = "Hello world";
        //create an output stream
        FileOutputStream out = new FileOutputStream("/Users/chenliang/Desktop/out.txt");


        FileChannel channel = out.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(1024);

        buffer.put(str.getBytes());

        buffer.flip();

        channel.write(buffer);

        out.close();
    }
}
