package s075;

public class Dog {
	private static final String DEFAULT_NAME = "???";
	private static final int DEFAULT_WEIGHT = 7;

	private String name;
	private int weight;

	public Dog() {
		this(DEFAULT_NAME, DEFAULT_WEIGHT);
	}

	public Dog(String name) { // voglio costruire nome c'è l ho, peso di default inizializzato sopra;
		this(name, DEFAULT_WEIGHT);
	}

	public Dog(int weight) {
		this(DEFAULT_NAME, weight);// chiamo il costruttore con proprietà peso;
	}

	public Dog(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	public String getName() {// getname mi ritorna il valore; (setname posso cambiare il valore);
		return name;
	}

    @Override
    public String toString() {// rappresentazione stringa al mio cane;
        return "S75Dog [name=" + name + ", weight=" + weight + "]";
    }
}
