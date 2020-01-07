package s075;

public class Poodle extends Dog {
	private static final int DEFAULT_DENSITY = 3;
	private int curlDensity;
	
	public Poodle() {
		super();// chiamo il costruttore di default del Dog;
		this.curlDensity = DEFAULT_DENSITY;
	}

	public Poodle(String name) {
		super(name);
	}

	public Poodle(String name, int weight) {// utente vuole nome e peso;
		this(name, weight, DEFAULT_DENSITY);
	}

	public Poodle(String name, int weight, int curlDensity) {
		super(name, weight);// fammi il DOG; 
		this.curlDensity = curlDensity;
	}
	
	@Override
	public String getName() {
		return "Poodle " + super.getName();
	}
	
	@Override
	public String toString() {// chiamo toString del Dog; è necessario scivere super altrimenti faccio loop infinito.
		return "Poodle " + super.toString() + " " + curlDensity;
	}
}
