package org.example;

public class ExceptionThrower {

    public void throwException(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }

        // You can put more logic here if needed
        System.out.println("Input is: " + input);
    }
}
