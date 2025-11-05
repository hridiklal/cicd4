package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for App class
 */
public class AppTest {
    
    private final App app = new App();
    
    @Test
    public void testGetGreeting() {
        String expected = "Hello World!";
        String actual = app.getGreeting();
        assertEquals(expected, actual, "Greeting should match expected output");
    }
    
    @Test
    public void testAddMethod() {
        assertEquals(5, app.add(2, 3), "2 + 3 should equal 5");
        assertEquals(0, app.add(0, 0), "0 + 0 should equal 0");
        assertEquals(-1, app.add(2, -3), "2 + (-3) should equal -1");
    }
    
    @Test
    public void testAddMethodWithNegativeNumbers() {
        assertEquals(-5, app.add(-2, -3), "-2 + (-3) should equal -5");
    }
}
