package s044;

public class Exercise3 {
	public static void main(String[] args) {
		int[] array = { 7, 3, 1, 2, 4, 8 };
		int even = array[0];
		int counter = 0;
	

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				counter = counter + 1;

			} else {
				continue; }
			}
		System.out.println(" your array has" + counter + "even numbers");
		}
}
