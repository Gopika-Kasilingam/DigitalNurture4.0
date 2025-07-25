package Week1_DesignPrinciplesAndPatterns.HandsOn6_ProxyPatternExample.Code;

/*
 * RealImage simulates loading an image from a remote server.
 * This is a heavy operation, so we avoid doing it unless needed.
 */
public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromServer();
    }

    // Simulate loading image (time-consuming)
    private void loadFromServer() {
        System.out.println("Loading image from server: " + filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying: " + filename);
    }
}
