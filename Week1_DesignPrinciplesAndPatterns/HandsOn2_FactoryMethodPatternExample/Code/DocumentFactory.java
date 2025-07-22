package Week1_DesignPrinciplesAndPatterns.HandsOn2_FactoryMethodPatternExample.Code;

/**
 * Factory class to create instances of Document subclasses.
 *
 *   NEED FOR FACTORY DESIGN PATTERN 
 * 
 * - When we need to create objects **without exposing the creation logic** to the client.
 * - Useful when the class to be instantiated is decided at runtime.
 * - Promotes loose coupling by separating object creation from usage.
 * - Makes code easier to maintain and extend (add new document types easily).
 */

public class DocumentFactory {

    // Returns the appropriate Document implementation based on input
    public Document getInstance(String str) {
        if (str.equalsIgnoreCase("word")) {
            return new WordDocument();
        } else if (str.equalsIgnoreCase("pdf")) {
            return new PdfDocument();
        } else {
            return new ExcelDocument(); // default case
        }
    }
}
