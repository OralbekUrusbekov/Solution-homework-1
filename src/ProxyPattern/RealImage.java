package ProxyPattern;

// RealImage class that loads and displays a high-resolution image
class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading high-resolution image: " + filename);
    }

    @Override
    public void displayThumbnail() {
        System.out.println("Displaying low-resolution thumbnail for: " + filename);
    }

    @Override
    public void displayFullImage() {
        System.out.println("Displaying high-resolution image: " + filename);
    }
}