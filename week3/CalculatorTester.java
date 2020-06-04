package pers.gc.copr;

public class CalculatorTester {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		//addition
		System.out.println(calc.addition(2, 2));
		System.out.println(calc.addition(2, 2, 2));
		System.out.println(calc.addition(2.4, 2.4));
		
		//subtraction
		System.out.println(calc.subtraction(4, 1));
		System.out.println(calc.subtraction(4, 1, 2));
		System.out.println(calc.subtraction(4.5, 1.1, 2.1));
		
		//multiplication
		System.out.println(calc.multiplication(2, 2));
		System.out.println(calc.multiplication(2, 2, 2));
		System.out.println(calc.multiplication(2.5, 2.5));
		System.out.println(calc.multiplication(2.5, 2.5, 2.5));
		
		//division
		System.out.println(calc.division(5, 5));
		System.out.println(calc.division(25.5, 2.5));
	}
	
}
