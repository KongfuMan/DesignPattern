package NIO.StudyChannel;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOFileCopyFile {

    public static void main(String[] args) throws IOException {
        File file = new File("/Volumes/CL/安装包/cn_windows_7_ultimate_with_sp1_x64_dvd_u_677408.iso");
        FileInputStream in = new FileInputStream(file);

        FileOutputStream out = new FileOutputStream("/Volumes/CL/win7.iso");

        FileChannel inChannel = in.getChannel();

        FileChannel outChannel = out.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(1024*1024*512);

        while(true){
            buffer.clear();
            int read = inChannel.read(buffer);
            if (read == -1){
                break;
            }
            buffer.flip();
            outChannel.write(buffer);
        }
        in.close();
        out.close();
    }
}
