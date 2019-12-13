package s050;

public class AboutStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(20);// quanti caratteri ci posso mettere dentro?;
        StringBuilder sb3 = new StringBuilder("hello");
        
        System.out.println("capacity 1: " + sb.capacity());// mi stampa capacità corrente per stamparci;
        System.out.println("capacity 2: " + sb2.capacity());
        System.out.println("capacity 3: " + sb3.capacity());
        
        System.out.println("appending: " + sb3.append(' ').append("world"));// lavora sulla string.builder corrente;
        
        System.out.println("char at position 1 in sb3 is '" + sb3.charAt(1) + "'");
        
        System.out.println("deleting: " + sb3.delete(5, 10).deleteCharAt(2));// elimina carattere nella posizione 2;
        
        System.out.println("index of \"elo\": " + sb3.indexOf("elo"));
        
        System.out.println("inserting \"lo c\" at 3: " + sb3.insert(3, "lo c")); //inserisco caratteri a partire dalla posizione 3;
        
        System.out.println("current sb3 length: " + sb3.length());
        
        System.out.println("replace section 2-7 with \"r r\": " + sb3.replace(2, 7, "r r")); //prendimi l'intervallo da 2(incluso) a 7(escluso) sostituisci con l caratteri nuovi che ti ho dato;
        
        System.out.println("reversing: " + sb3.reverse());// mi permette di ribaltare stringa corrente
        
        sb3.setCharAt(5, 'a');// vai in carattere specifico e mettici a;
        System.out.println("setCharAt: " + sb3);
        
        sb3.setLength(3);// cambia lunghezza di length, decidi tu quanto è lunga;
        System.out.println("setLength: " + sb3);
    }
}
