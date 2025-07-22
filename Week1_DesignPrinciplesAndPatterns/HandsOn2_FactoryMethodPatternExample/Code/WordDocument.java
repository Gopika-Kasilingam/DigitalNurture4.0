package Week1_DesignPrinciplesAndPatterns.HandsOn2_FactoryMethodPatternExample.Code;

/**
 * Concrete class that implements Document interface.
 * Represents a Word document.
 */
public class WordDocument implements Document {
    @Override
    public void createDocument() {
        System.out.println("Word document is opened");
    }
}
