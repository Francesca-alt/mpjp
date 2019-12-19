package s073;

public class Cat extends Mammal {
    private Tail tail;// proprietà privata tail;

    public Cat(int gestationDays, int tailLen) {// costruttore (non ha tipo,stesso nome della classe, non ha return) Cat che ha due parametri:lunghezza coda e giorni gestation;
        super(gestationDays);//super?;
        this.tail = new Tail(tailLen);
    }

    @Override
    public String toString() {// metodo toString che stampa qualcosa sul gatto;
        return "Cat [tail=" + tail + ", gestation=" + gestation + "]";//  tail di che tipo è? di classe Taill; tail to string viene convertito; gestation viene dalla classe madre e visibilità protetta quindi la classe figlia lo vede;
    }
}
