package ex;

public class S60 {
	/**
	 * Reverse a string
	 * 
	 * @param s
	 * @return the input reversed
	 */
	public static String reverse(String s) {
		// TODO
		StringBuilder sb = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}

	/**
	 * Check if the parameter is a palindrome
	 * 
	 * @param s
	 * @return true if the parameter is a palindrome
	 */
	public static boolean isPalindrome(String s) {
		// TODO
		int len = s.length();
		for (int i = 0; i < len / 2; i++) {
			if (s.charAt(i) != s.charAt(len - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Remove vowels from the parameter
	 * 
	 * @param s
	 * @return a string, same of input but without vowels
	 */
	public static String removeVowels(String s) {
		// TODO
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (true)
				sb.append(c);
		}
		return sb.toString();
	}

	/**
	 * Convert from binary to decimal
	 * 
	 * @param s a string that contains the binary representation of an integer
	 * @return the converted integer
	 */
	public static int bin2dec(String s) {
		// TODO
		return 0;
	}

	/**
	 * Reverse an array of integers
	 * 
	 * @param data
	 * @return a new array holding the same elements of input, in reversed order
	 */
	public static int[] reverse(int[] data) {
		int[] result = new int[0];
//		while( != 0) { si può usare?
//	         int digit = i % 10;
//	         rev=0;
//	         rev = rev * 10 + digit;
//	         i /= 10;
//	      }
//	      System.out.println("Reversed: " + rev);
	      int j= 0;
		for (int i = data.length - 1; i >= 0; i--) { //data.length-1,j=0,i>0; j++
		result[j]=data[i];
	      j++;

		}
		return result;
		
	}
	/**
	 * Calculate the average
	 * 
	 * @param data
	 * @return the average // non posso fare la divisione tra int;
	 */
	public static double average(int[] data) {
		double sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return sum / data.length;
	}

	/**
	 * Find the largest value
	 * 
	 * @param data
	 * @return the largest value
	 */
	public static int max(int[] data) {
		int result = Integer.MIN_VALUE;
		for (int i = 0; i < data.length; i++) {
			if(data[i]>result) {
				result= data[i];
			}
		}
		return result;
	}
}
