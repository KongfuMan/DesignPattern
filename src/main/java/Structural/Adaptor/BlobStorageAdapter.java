package Structural.Adaptor;

public class BlobStorageAdapter implements IStorage {
    private BlobStorage blobStorage;

    public BlobStorageAdapter(BlobStorage blobStorage){
        this.blobStorage = blobStorage;
    }

    @Override
    public void save() {
        blobStorage.blobSpecificSave();
    }
}
