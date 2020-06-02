package pers.gc.copr;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner intInput = new Scanner(System.in);
		System.out.println("Please enter line size: ");
		int lineSize = intInput.nextInt();
		printPattern(lineSize);
		intInput.close();
	}
	
	public static void printPattern(int lineSize) {
		for(; lineSize>=1; lineSize--) {
			for(int i=0; i<lineSize; i++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}
}
