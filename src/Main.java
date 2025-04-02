import ProxyPattern.*;

// Main Class to Test Both Patterns
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Proxy Pattern Test ---");
        Image img1 = new ProxyImage("house1.jpg");
        img1.displayThumbnail(); // Show thumbnail immediately
        img1.displayFullImage(); // Load full image only when requested

        // Test Protection Proxy
        ImageUploader uploader = new ImageUploader(false);
        uploader.uploadImage("new_house.jpg"); // Should deny access

        ImageUploader agentUploader = new ImageUploader(true);
        agentUploader.uploadImage("new_house.jpg"); // Should allow upload


    }
}
