package pers.gc.copr;

import java.util.Scanner;

public class Exercise2 {
	
	public static void main(String[] args) {
		Scanner intInput = new Scanner(System.in);
		System.out.println("Please enter snow depth: ");
		int snowDepth = intInput.nextInt();
		boolean canSki = TimeToSki.isTimeToSki(snowDepth);
		if(canSki)
			System.out.println("Can ski because the snow depth over 30cm.");
		else
			System.out.println("Cannot ski because the snow depth less 30cm.");
		intInput.close();
	}
	
}
