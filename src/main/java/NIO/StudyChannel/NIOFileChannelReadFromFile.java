package NIO.StudyChannel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOFileChannelReadFromFile {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/chenliang/Desktop/out.txt");
        FileInputStream in = new FileInputStream(file);
        FileChannel channel = in.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate((int)file.length());
        channel.read(buffer);


        String str = new String(buffer.array());
        System.out.println(str);
        in.close();
    }

}
