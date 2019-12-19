package ex;

public class S58 {
	/**
	 * Check if the parameter is positive, negative, or zero
	 * 
	 * @param value an integer
	 * @return "positive", "negative", or "zero"
	 */
	public static String checkSign(int value) {
		if (value < 0) {
			return "negative";
		} else if (value > 0) {
			return "positive";
		} else {

			return "0";
		}
	}

	/**
	 * Check if the parameter is odd
	 * 
	 * @param value an integer
	 * @return "odd" or "even"
	 */
	public static boolean isOdd(int value) {
		if ((value %= 2) == 1) {
			return true;// even
		} else {
			return false;// odd
		}
	}

	/**
	 * Convert the parameter to its English name, if it is in [0..9]
	 * 
	 * @param value an integer
	 * @return "zero" for 0 ... "nine" for 9, or "other"
	 */
	public static String asWord(int value) {
		switch (value) {
		case 0:
			return "zero";
		case 1:
			return "one";
		case 2:
			return "two";
		case 3:
			return "three";
		case 4:
			return "four";
		case 5:
			return "five";
		case 6:
			return "six";
		case 7:
			return "seven";
		case 8:
			return "eight";
		default:
			return "other";

		}
	}

	/**
	 * Convert a value in the interval [0, 100] to a letter in [A, F]
	 * 
	 * A if value > 90 B if value in (80, 90] ... F if value <= 50
	 * 
	 * @param percentile in [0, 100]
	 * @return a letter in [A, F]
	 */
	//public static char vote(double percentile) {
		// TODO
//		if (percentile > 90) {
//			return 'A';
//		} else if (percentile > 80) {
//			return 'B';
//		} else if (percentile > 70) {
//			return 'C';
//		} else if (percentile > 60) {
//			return 'D';
//		} else if (percentile > 50) {
//			return 'E';
//		} else if (percentile <= 50) {
//			return 'F';
//		}
//	}

	/**
	 * Leap year checker
	 * 
	 * @param year
	 * @return true if leap year
	 */
	public static boolean isLeapYear(int year) {
		// TODO
		if (year % 400 == 0) { // year è divisibile per 400 quindi è leap year;
			return true;
		} else if (year % 4 == 0 && year % 100 != 0) {
			return true;
		} else {
			return false;
		}
	}
}

	/**
	 * Sort the input parameters
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return a sorted array
	 */
//	public static int[] sort(int a, int b, int c) {
//		int[] result = new int[3];
//		if (a < b) {
//			if(c<a)
//		    result[0] = c;
//			result[1] = a;
//			result[2]=b;
//		} else if (c>b){
//			result[0] = a;
//			result[1] = b;
//			result[2]= c;
//		} else if (a>b)
//			if (c>a)
//				result[0]=
//				result[1]=
//				result[2]=
//				else if(c>b)
//					result
//
//
//		// TODO
//
//		return result;
//	}
//}
