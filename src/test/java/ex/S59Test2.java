package ex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class S59Test2 {

	@Test // il metodo che segue è un test vero e proprio;
	void multiplicationTableThree() {
		int[][] actual = S59.multiplicationTable(3);

		int[][] expected = { { 1, 2, 3 }, { 2, 4, 6 }, { 3, 6, 9 }, };

//		int[][] expected =new int [3][3];// tabellina del 3;

		assertEquals(expected.length, actual.length);// sto dicendo che c'è = tra la lungh. che mi aspetto e attuale.
		for (int i = 0; i < expected.length; i++) {// i mi rappresenta le righe, variabile di loop;
			assertEquals(expected[i].length, actual[i].length);// asserisco la lunghrezza di righe deve essere uguale,
																// la i-esima;
		}
		for (int i = 0; i < expected.length; i++) {
			for (int j = 0; j < expected.length; j++) {// mi guardo tutte le celle della riga in questione;
				assertEquals(expected[i][j], actual[i][j]); // confrontami i con j se c'è un solo elemento il test fallisce;
			}
	}

}
}
