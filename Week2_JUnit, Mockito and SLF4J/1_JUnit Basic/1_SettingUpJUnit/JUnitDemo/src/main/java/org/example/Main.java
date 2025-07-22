package org.example;

public class Main {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println("Sum: " + obj.add(10, 20));
    }
}