package s049;

public class AboutString {
    public static void main(String[] args) {
        String s = "hello";
        String t = "world";
        String u = "or";
        System.out.println("s, t, u: " + s + ", " + t + ", " + u); // s t u in rosso intendo il contenuto del mio carattere quindi Hello,world,or;

        System.out.println("char at position 1 in s: " + s.charAt(1));// cerca carattere in posizione 1 che è "e" poichè inizia da 0 che è h;

        System.out.println("s < t: " + s.compareTo(t));// compare (a sinistra) -1, 0, +1 (a destra);
        System.out.println("t > s: " + t.compareTo(s));

        System.out.println("concat s and t: " + s.concat(t));// stesso cosa di fare il +, concateno s con t;

        System.out.println("t contains u? " + t.contains(u));

        String u2 = t.substring(1, 3);//ho una stringa t voglio prendere una sottostringa che inizia da carattere 1 incluso  ed arriva al carattere 3 escluso;
        System.out.println("u2 = t.substring(1, 3): " + u2);
        System.out.println("t.substring(3): " + t.substring(3));// begin è 3 e va avanti fino alla fine della parola;

        System.out.println("u equals u2? " + u.equals(u2));
        System.out.println("u == u2? " + (u == u2));// faccio il confronto su reference diverso, quindi false;

        System.out.println("First index of 'l' is s: " + s.indexOf('l'));
        System.out.println("Last index of 'l' is s: " + s.lastIndexOf('l'));
        System.out.println("there is no 'x' in s: " + s.indexOf('x'));//se non trova carattere che gli ho detto di cercare mi ritorna -1;
        System.out.println("in s \"ll\" starts at " + s.indexOf("ll"));
        System.out.println("there is no \"lx\" in s: " + s.indexOf("lx"));

        System.out.println("check if an empty string is empty: " + "".isEmpty());// guarda se la stringa è vuota;

        System.out.println("s length: " + s.length());

        String s2 = s.replace('l', 'q');// sostituzione carattere;
        System.out.println("Replacing 'l' with 'q': " + s + " -> " + s2);

        String[] splits = "one for me, one for you".split(" ");//lavora sulla stringa ma la divide con il carattere bianco; ritorna array di stringhe;
        System.out.println("Splitting: ");
        for (String token : splits) {// for each;
            System.out.println(token);
        }
        String joined = String.join(" ", splits);
        System.out.println("Joining back [" + joined + "]");

        System.out.println("upper: " + s.toUpperCase());// mi coverte una stringa in maiuscola, è una copia modificata;
        System.out.println("lower: " + "SHUT UP!".toLowerCase());// minuscolo;

        System.out.println("trim [" + " la la la ".trim() + "]");// troca,taglia gli spazi bianchi all'inizio e alla fine della mia stringa;
        
        String x = null;// mi coverte x nell arappresentazione stringa, è una factory il modo di costruire oggetti. creo stringa e poi gli passo la variabile x;
        System.out.println("Sort of safe toString(): " + String.valueOf(x));
    }
}
