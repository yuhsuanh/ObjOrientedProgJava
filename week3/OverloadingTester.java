package pers.gc.copr;

public class OverloadingTester {

	public static void main(String[] args) {
		Overloading overloading = new Overloading();
		
		//integer
		System.out.println(overloading.square(2));
		//double
		System.out.println(overloading.square(2.5));
	}
	
}
