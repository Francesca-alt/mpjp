package s048;

public class Main {
	public static void main(String[] args) {
		Dog[] dogs = new Dog[10]; // creo la mia array di cani(che non è un primitivo quindi è un reference) e la
									// inizializzo con spazio 10; in [] c'è null;

		for (int i = 0; i < dogs.length; i++) { // i mi rappresenta quante volte voglio fare questo loop;
			dogs[i]=new Dog();
		}
		dogs[5].bark();
		
	}
}
