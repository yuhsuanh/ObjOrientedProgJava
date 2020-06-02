package pers.gc.copr;

public class TimeToSki {
	
	public static boolean isTimeToSki(int snowDepth) {
		boolean result = (snowDepth > 30) ? true: false;
		return result;
	}
}
