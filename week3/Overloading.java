package pers.gc.copr;

public class Overloading {

	public int square(int intValue) {
		System.out.println("Called the square method with integer argument");
		return intValue * intValue;
	}
	
	public double square(double doubleValue) {
		System.out.println("Called the square method with double argument");
		return doubleValue * doubleValue;
	}
	
}
