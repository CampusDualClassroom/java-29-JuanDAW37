package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args)throws ArithmeticException {
        try {
            int a = 10;
            int b = 0;
            int c = a/b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        } finally {
            System.out.println("End of the application");
        }
    }
}
