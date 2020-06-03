package Structural.Adaptor;

public class Client {
    public static void main(String[] argvs){
        IStorage storage = new S3StorageAdapter(new S3Storage());
        storage.save();

        storage = new BlobStorageAdapter(new BlobStorage());
        storage.save();
    }
}
