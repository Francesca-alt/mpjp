package s076;

public class Pet {
	private static final String DEFAULT_COLOR = "white";
	private static final String DEFAULT_NAME = "My pet";

	private String name;
	private String color;

	public Pet() {
		this(DEFAULT_NAME);
	}

	public Pet(String name) {
		this(name, DEFAULT_COLOR);
	}
//        this.name = name;
//        this.color= DEFAULT_COLOR;

	public Pet(String name, String color) {
		this.name = name;
		this.setColor(color);

	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {// PER MODIFICARE COLORE;
		this.color = color;
	}
}