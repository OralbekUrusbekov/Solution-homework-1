package ProxyPattern;

// Protection Proxy
// Ensures only agents can upload images
public class ImageUploader {
    private boolean isAgent;

    public ImageUploader(boolean isAgent) {
        this.isAgent = isAgent;
    }

    public void uploadImage(String filename) {
        if (isAgent) {
            System.out.println("Uploading image: " + filename);
        } else {
            System.out.println("Access denied! Only agents can upload images.");
        }
    }
}