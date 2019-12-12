package s044;

public class Loop {
	public static void main(String[] args) {// args è un parametro. main=args
		int[] data = { 5, 7, 1, 3, 4 };
		System.out.print("[");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]);
			if (i < data.length - 1) {
				System.out.print(",");
			}

		}
		System.out.print("]");
		System.out.println();

		int i = 0;
		System.out.print("[");
		while (i < data.length) {
			System.out.print(data[i]);
			if (i < data.length - 1)
				System.out.print(",");
			
			i++;
		}
		System.out.print("]");
		System.out.println();

		System.out.print("[");
		for (int item : data) {// item valore corrente della mia array;for each non voglio sapere la mia posizione;
			System.out.print(item);
			System.out.print(",");
		}
		System.out.print("]");
	}
}
