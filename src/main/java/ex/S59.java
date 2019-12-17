package ex;

public class S59 {
	/**
	 * Add up all the numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the numbers, or zero
	 */
	public static long sum(int first, int last) {
		// TODO
		long result = 0;// overflow;
		for (int cur = first; cur <= last; cur++) {
			result = result + cur;
		}
		if (last < first)
			return 0;
		return result;
	}

	/**
	 * Add up only the even numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the even numbers, or zero
	 */
	public static long evenSum(int first, int last) {
		int sum = 0;
		long result = 0;
		for (int cur = first; cur <= last; cur++) {
			if (cur % 2 == 0)
				result += cur;
		}

		return result;
	}

	/**
	 * Factorial
	 * 
	 * @param value
	 * @return factorial of input value, or zero
	 */
	public static long factorial(int value) {
		// TODO
		int i;
		int f = 1;
		for (i = 1; i < value; i++) {
			f = f * i;
		}

		return f;
	}

	/**
	 * Fibonacci number (0, 1, 1, 2, 3, 5, 8, �)
	 * 
	 * @param value
	 * @return the Fibonacci number of value, or zero
	 */
	public static long fibonacci(int value) {
		if (value == 0) {
			return 0;
		} else if (value == 1 || value == 2) {
			return 1;// esluso i casi limite;
		} else {
			return 0;
		}
		//long cur = 2;
//		long prev = 1;
//		for (int i = 4; i <= 4; i++) {
//			cur = cur + prev; // long temp=cur;
//			long temp = cur;
//			prev = temp;
		}


	/**
	 * Multiplication table
	 * 
	 * @param value
	 * @return The multiplication table for value, when possible
	 */
	public static int[][] multiplicationTable(int value) {
		int[][] result = new int[value][value];
		for (int i = 0; i < value; i++) {
			for (int j = 0; j < value; j++)
				result[i][j] = (i + 1) * (j + 1);
		}

		return result;
	}
}
