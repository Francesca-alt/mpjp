package ex;

public class Sum {
	public static int arrayPlusArray(int[] arr1, int[] arr2) {
		var somma = 0; //int somma=0

		for (int i = 0; i < arr1.length; i++) { // potevi usare anche for each for(int cur:a); cur intende valore corrente;
			somma = somma + arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			somma = somma + arr2[i];

		}
		return somma;
	}
}
