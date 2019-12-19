package s062;

public class Scope {
    private static int staticMember = 5;// è statico (lo vede solo in quella classe) anche privato, è visibile da main poichè è statico anche lui;
    private long member = 5; //member non si vede poichè manca scope,era una variabile d'stanza; riga 24,25 aggiunte dopo;

    public void f() {
        int local = 7;
        if (staticMember == 2) {
            short inner = 12;
            staticMember = 1 + inner;
            member = 3 + local;
        }
    }

    public void g() {
        System.out.println(member);
    }
    
    public static void main(String[] args) {// main vede static member;
        double local = 5;// variabile locale diversa definiti in blocchi diversi;
        System.out.println(local);
        staticMember = 12;
      Scope scope = new Scope ();
     System.out.println(scope.member);
        scope.f();
    }
}
