package Week1_DesignPrinciplesAndPatterns.HandsOn2_FactoryMethodPatternExample.Code;

/**
 * Interface for all document types.
 * Each document type will implement this and provide its own version of createDocument().
 */
public interface Document {
    void createDocument();
}
