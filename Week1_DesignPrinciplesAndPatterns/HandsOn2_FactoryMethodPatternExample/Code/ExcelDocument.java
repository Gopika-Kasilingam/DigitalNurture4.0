package Week1_DesignPrinciplesAndPatterns.HandsOn2_FactoryMethodPatternExample.Code;

/**
 * Concrete class that implements Document interface.
 * Represents an Excel document.
 */
public class ExcelDocument implements Document {
    public void createDocument() {
        System.out.println("Excel sheet is opened");
    }
}
