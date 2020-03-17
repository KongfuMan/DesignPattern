package Structural.Adaptor;

public class StorageAdapter implements ITarget {
    private S3ClientAdapter S3ClientAdapter;

    public StorageAdapter(S3ClientAdapter S3ClientAdapter) {
        this.S3ClientAdapter = S3ClientAdapter;
    }

    @Override
    public void request() {
        System.out.println("Inovke abstract adaptor request Method");
        this.S3ClientAdapter.specificRequest();
    }
}
