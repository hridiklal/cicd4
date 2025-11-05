package com.example;

/**
 * Hello world application
 */
public class App {
    
    public String getGreeting() {
        return "Hello World!";
    }
    
    public int add(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.getGreeting());
    }
}
