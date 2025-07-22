package Week1_DesignPrinciplesAndPatterns.HandsOn2_FactoryMethodPatternExample.Code;

/**
 * Concrete class that implements Document interface.
 * Represents a PDF document.
 */
public class PdfDocument implements Document {
    public void createDocument() {
        System.out.println("Pdf is opened");
    }
}
