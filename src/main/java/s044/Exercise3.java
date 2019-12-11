package s044;

public class Exercise3 {
	public static void main(String[] args) {
		int[] array = { 7, 3, 1, 2, 4, 8 };
		int counter = 0;
		var sum = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				counter = counter + 1;

			} else {
				sum = sum + array[i];
			}

			System.out.println(counter);
			System.out.println(sum);

		}
	}
}
