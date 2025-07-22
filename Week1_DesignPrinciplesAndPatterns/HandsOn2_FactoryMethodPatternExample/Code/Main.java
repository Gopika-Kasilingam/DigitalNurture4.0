package Week1_DesignPrinciplesAndPatterns.HandsOn2_FactoryMethodPatternExample.Code;

/**
 * Main class to test Factory Method Pattern.
 * Demonstrates how different document types are created using a common interface and factory logic.
 */
public class Main {
    public static void main(String[] args) {

        // Creating WordDocument using factory
        DocumentFactory df = new DocumentFactory();
        Document d = df.getInstance("word");
        d.createDocument(); // Output: Word document is opened

        // Creating PdfDocument using factory
        DocumentFactory df1 = new DocumentFactory();
        Document d1 = df1.getInstance("pdf");
        d1.createDocument(); // Output: Pdf is opened

        // Creating ExcelDocument using factory
        DocumentFactory df2 = new DocumentFactory();
        Document d2 = df2.getInstance("excel");
        d2.createDocument(); // Output: Excel sheet is opened
    }
}
