package s062;

public class Evenumbers {
	public static int[] divisibleBy(int[] numbers, int divider) {
		int counter = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (i % divider == 0)
				counter++;
		}
		int[] array = new int[counter];
		int cur = 0;
		int i = 0;
		for (int l = 0; l < numbers.length; l++) {
			if (array[i] % divider == 0) {
				array[l] = numbers[i];
				cur++;
			}
		}
		return array;
	}
}
