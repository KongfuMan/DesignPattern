package Structural.Adaptor;

public class Client {
    public static void main(String[] argvs){
        ITarget target = new StorageAdapter(new S3ClientAdapter());
        target.request();
    }
}
