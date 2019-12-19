package s073;

public abstract class Mammal {// classe astratta di mammiferi che ha come proprietà gestation;
    protected int gestation;

    public Mammal(int gestation) {//è un metodo(costruttore ha lo stesso nome della classe) con il parametro int;
        this.gestation = gestation;// voglio che gestation sinistra sia inserito in gestation proprietà,
        //mentre quello a destra va alla ricerca dello stesso gestation più simile ovvero il parametro;
    }

    @Override
    public String toString() {// mi ritorno alla classe madre stringa ovvero Mammal;
    	
    	return "Mammal [gestation=" + gestation + "]";
    }
}
