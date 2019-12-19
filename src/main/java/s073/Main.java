package s073;

public class Main {
    public static void main(String[] args) {// ogni array di Mammal mi crea un gatto e un cane
        Mammal[] mammals = new Mammal[2];
        mammals[0] = new Dog(63, 40);
        mammals[1] = new Cat(63, 20);

        for (Mammal mammal : mammals) {// mi vedo tutti gli elementi della mia array;
            System.out.println(mammal.toString());
        }
        for(int i=0; i<mammals.length; i++) { // in alternativa di for each;
        	System.out.println(mammals[i].toString());
        }
    }
}
