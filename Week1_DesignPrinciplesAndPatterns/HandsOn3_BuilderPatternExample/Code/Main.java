package Week1_DesignPrinciplesAndPatterns.HandsOn3_BuilderPatternExample.Code;

public class Main {
    public static void main(String[] args) {

        // Creating computer configurations using the builder
        Computer computer1 = new Computer.Builder()
                .setCPU("Intel Core i5")
                .setRAM("8GB")
                .setStorage("512GB SSD")
                .build();

        // Can specify the parameters in any order
        Computer computer2 = new Computer.Builder()
                .setRAM("16GB")
                .setCPU("AMD Ryzen 7")
                .setStorage("1TB HDD")
                .build();

        System.out.println("Computer 1: " + computer1);
        System.out.println("Computer 2: " + computer2);
    }
}
