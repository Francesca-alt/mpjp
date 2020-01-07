package s076;

public class Main {
	public static void main(String[] args) {
		Dog tom = new Dog("Tom");

		String name = tom.getName();
		double speed = tom.getSpeed();
		tom.setColor("red");

		System.out.println("Name and speed: " + name + ", " + speed);
		System.out.println("Color:" + tom.getColor());
	}
}
