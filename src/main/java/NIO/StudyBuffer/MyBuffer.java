package NIO.StudyBuffer;

import java.nio.IntBuffer;

public class MyBuffer {
    public static void main(String[] args) {
        IntBuffer buffer = IntBuffer.allocate(5);
        for (int i = 0; i < buffer.capacity(); i++){
            buffer.put(2 * i);
        }

        buffer.flip();

        while(buffer.hasRemaining()){
            System.out.println(buffer.get());
        }
    }
}
