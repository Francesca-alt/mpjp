package s070;

public class Main {
    public static void main(String[] args) {
        Barker[] barkers = new Barker[2];
        
        barkers[0] = new Fox();// implemento interfaccia bakers, rendo fox bakers;
        barkers[1] = new Dog();

        for(Barker barker: barkers) {//
            System.out.println(barker.bark());
        }
        
        BarkAndWag baw = new Dog();// parto da destra mi è stato creato un nuovo cane  definisco che abbaia;
        System.out.println(baw.tailWaggingSpeed());// capacità di scodinzolare; mi basta interface;

        Dog dog = new Dog();// metodo non è definito in nessun altra parte, vuole solo abbaiare;
        System.out.println(dog.bark(3));
    }
}
