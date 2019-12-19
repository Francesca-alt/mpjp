package s073;

public class Tail {
    private int size;

    public Tail(int size) {
        this.size = size;
    }

    public int getSize() {// sapere quanto è lunga la coda del mio gatto; non posso modificarla; 
        return size;
    }

    @Override
    public String toString() {
        return "Tail [size=" + size + "]";
    }
}
