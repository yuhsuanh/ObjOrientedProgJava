package pers.gc.copr;

import java.util.Scanner;

public class MaximumTester {

	public static void main(String[] args) {
		
		Maximum max = new Maximum();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter three floating-point number: ");
		double num1 = scanner.nextFloat();
		double num2 = scanner.nextFloat();
		double num3 = scanner.nextFloat();
		double result = max.findMax(num1, num2, num3);
		
		System.out.println("The maximum number is " + result);
		
	}
	
}
