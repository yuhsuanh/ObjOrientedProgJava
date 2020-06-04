package pers.gc.copr;

public class Maximum {

	public double findMax(double num1, double num2, double num3) {
		double maxValue = 0;
		
		if(num1 > num2)
			maxValue = num1;
		if(num3 > maxValue)
			maxValue = num3;
		
		return maxValue;
	}
	
}
