package Week1_DesignPrinciplesAndPatterns.HandsOn6_ProxyPatternExample.Code;

/*
 * ProxyImage adds lazy initialization and caching.
 * Loads RealImage only when display() is called for the first time.
 */
public class ProxyImage implements Image {
    private String filename;
    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        // Load the real image only once (lazy initialization)
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        // Display the image (cached RealImage is reused)
        realImage.display();
    }
}
