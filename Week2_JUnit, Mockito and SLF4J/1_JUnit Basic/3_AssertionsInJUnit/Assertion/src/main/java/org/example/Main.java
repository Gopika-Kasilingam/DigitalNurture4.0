package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum: " + calc.add(10, 20));
        System.out.println("Product: " + calc.multiply(10, 5));
    }
}
