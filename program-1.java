package com.calculator;

import java.util.Scanner;

public class Calculator {
	

	
	    double calculate(double a, double b, String operation) {
	        switch (operation.toLowerCase()) {
	            case "add": return a + b;
	            case "subtract": return a - b;
	            case "multiply": return a * b;
	            case "divide": return b != 0 ? a / b : Double.NaN;
	            default: throw new IllegalArgumentException("Invalid operation");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Calculator calc = new Calculator();

	        System.out.print("Enter first number: ");
	        double a = sc.nextDouble();

	        System.out.print("Enter second number: ");
	        double b = sc.nextDouble();

	        System.out.print("Enter operation (add, subtract, multiply, divide): ");
	        String op = sc.next();

	        try {
	            double result = calc.calculate(a, b, op);
	            System.out.println("Result: " + result);
	        } catch (IllegalArgumentException e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	        sc.close();
	    }
	}



