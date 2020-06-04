package pers.gc.copr;

public class Calculator {

	//Addition
	public int addition(int val1, int val2) {
		System.out.println("Addition: 2 integer values");
		return val1 + val2;
	}
	public int addition(int val1, int val2, int val3) {
		System.out.println("Addition: 3 integer values");
		return val1 + val2 + val3;
	}
	public float addition(float val1, float val2) {
		System.out.println("Addition: 2 float values");
		return val1 + val2;
	}
	public float addition(float val1, float val2, float val3) {
		System.out.println("Addition: 3 float values");
		return val1 + val2 + val3;
	}
	public double addition(double val1, double val2) {
		System.out.println("Addition: 2 double values");
		return val1 + val2;
	}
	public double addition(double val1, double val2, double val3) {
		System.out.println("Addition: 3 double values");
		return val1 + val2 + val3;
	}
	
	//Subtraction
	public int subtraction(int val1, int val2) {
		System.out.println("Subtraction: 2 integer values");
		return val1 - val2;
	}
	public int subtraction(int val1, int val2, int val3) {
		System.out.println("Subtraction: 3 integer values");
		return val1 - val2 - val3;
	}
	public float subtraction(float val1, float val2) {
		System.out.println("Subtraction: 2 float values");
		return val1 - val2;
	}
	public float subtraction(float val1, float val2, float val3) {
		System.out.println("Subtraction: 3 float values");
		return val1 - val2 - val3;
	}
	public double subtraction(double val1, double val2) {
		System.out.println("Subtraction: 2 double values");
		return val1 - val2;
	}
	public double subtraction(double val1, double val2, double val3) {
		System.out.println("Subtraction: 3 double values");
		return val1 - val2 - val3;
	}
	
	//Multiplication
	public int multiplication(int val1, int val2) {
		System.out.println("Multiplication: 2 integer values");
		return val1 * val2;
	}
	public int multiplication(int val1, int val2, int val3) {
		System.out.println("Multiplication: 3 integer values");
		return val1 * val2 * val3;
	}
	public float multiplication(float val1, float val2) {
		System.out.println("Multiplication: 2 float values");
		return val1 * val2;
	}
	public float multiplication(float val1, float val2, float val3) {
		System.out.println("Multiplication: 3 float values");
		return val1 * val2 * val3;
	}
	public double multiplication(double val1, double val2) {
		System.out.println("Multiplication: 2 double values");
		return val1 * val2;
	}
	public double multiplication(double val1, double val2, double val3) {
		System.out.println("Multiplication: 3 double values");
		return val1 * val2 * val3;
	}
	
	//Division
	public double division(int dividend, int divisor) {
		System.out.println("Division: integer values");
		return (double)dividend * (double)divisor;
	}
	public float division(float dividend, float divisor) {
		System.out.println("Division: float values");
		return dividend * divisor;
	}
	public double division(double dividend, double divisor) {
		System.out.println("Division: double values");
		return dividend * divisor;
	}
}
