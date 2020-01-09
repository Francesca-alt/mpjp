package s081;

public class Simple {
	public int negate(int value) {
		if (value == Integer.MIN_VALUE) {
			throw new IllegalArgumentException("Can't negate MIN_VALUE");// non puoi eliminare la dichiarazione poichè
																			// checked;
		}
		return -value;// non si può negare il valore minimo;
	}

	public int negate2(int value) throws MyNegateException {
		if (value == Integer.MIN_VALUE) {
			throw new MyNegateException(Integer.MAX_VALUE);// questa è checked quindi la devo dichiarare;
		}
		return -value;
	}

	public static void main(String[] args) {// args argomenti passati dalla jvm;
		Simple simple = new Simple();
		if (args.length == 0) {
			System.out.println("No value ");

			return;
		}

		try {
			int value = Integer.parseInt(args[0]);
			int x = simple.negate2(value);
			System.out.println("My value negated is: " + x);
		} catch (NumberFormatException  e) {
			System.out.println("Pass me an integer");
			return;
		} catch (MyNegateException mne) {// casi anomali;
			System.out.println("My value negated is close to: " + mne.getAlternativeValue());
		}
	}
}

class MyNegateException extends Exception {
	private static final long serialVersionUID = 1L;
	private int alternativeValue;

	public MyNegateException(int alternativeValue) {
		this.alternativeValue = alternativeValue;
	}

	public int getAlternativeValue() {
		return alternativeValue;// questo valore può essere solo letto;
	}
}
