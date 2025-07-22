package Week1_DesignPrinciplesAndPatterns.HandsOn3_BuilderPatternExample.Code;

/*
 * The Builder Pattern is used to construct complex objects step-by-step.
 * It is useful when an object can be created with various combinations of parameters,
 * especially when some fields are optional or when there are too many constructor parameters.
 */

public class Computer {

    // Given attributes
    private String CPU;
    private String RAM;
    private String Storage;

    // Private constructor
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.Storage = builder.Storage;
    }

    // Static nested Builder class
    public static class Builder {
        private String CPU;
        private String RAM;
        private String Storage;

        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(String Storage) {
            this.Storage = Storage;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", Storage=" + Storage + "]";
    }
}
