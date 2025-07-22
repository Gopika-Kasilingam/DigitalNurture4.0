package Week1_DesignPrinciplesAndPatterns.HandsOn6_ProxyPatternExample.Code;

/*
 * Demonstrates the Proxy Pattern:
 * RealImage is loaded only when needed, improving performance.
 */
public class Main {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("photo1.jpg");
        Image img2 = new ProxyImage("photo2.jpg");

        // First time: image is loaded from server
        img1.display();

        // Second time: cached image is used
        img1.display();

        // New image: loaded from server
        img2.display();
    }
}
