package org.example;


import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testAdd() {
        Main main = new Main();
        int result = main.add(10, 20);
        assertEquals(30, result);
    }
}
