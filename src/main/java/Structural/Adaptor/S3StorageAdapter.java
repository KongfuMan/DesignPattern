package Structural.Adaptor;

/**
 * S3StorageAdapter used to convert incompatible S3Storage class into client-compatible.
 *
 * */
public class S3StorageAdapter implements IStorage {
    private S3Storage S3Storage;

    public S3StorageAdapter(S3Storage s3) {
        this.S3Storage = s3;
    }

    @Override
    public void save() {
        this.S3Storage.s3SpecificSave();
    }
}
