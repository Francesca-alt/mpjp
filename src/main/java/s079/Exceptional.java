package s079;

public class Exceptional {
    public void f() {
        try {
            g();
        } catch (Exception ex) {// nel caso in cui ci sia un eccezione;
            System.out.println("Exception caught");
        } finally {// in entrambi in casi sia try che catch si esegue;
            cleanup();
        }
    }

    public void g() throws Exception {// g tira eccezione;
        // ...
        if (somethingUnexpected()) {
            throw new Exception();
        }
    }

    private void cleanup() {
        System.out.println("performing cleanup");
    }

    private boolean somethingUnexpected() {
        return true;
    }

    public static void main(String[] args) {
        Exceptional exceptional = new Exceptional();
        exceptional.f();// mi sono creato come oggetto exceptional per poter richiamare f.
    }
}
