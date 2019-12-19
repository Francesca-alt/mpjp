package s072;

public class Main {
    public static void main(String[] args) {
        // Cannot instantiate
//        Abstract ma = new Abstract();
//        Abstract2 ma2 = new Abstract2();

        Abstract ma = new Concrete();// posso crearmi oggetto concreto e posso assegnarla un reference astratto; Cat [ ] cats= new Cat[20]; il mio vantaggio? possso lavorare su tutti i gatti;
        ma.anAbstractMethod();// pensa al miagolare, come miagola il mio gatto in questione, il mio metodo l ho inizializzato erichiamo il mio metodo di miagolare per il persiano concreto;

        Abstract2 ma2 = new Concrete2();
        ma2.aConcreteMethod();
    }
}
