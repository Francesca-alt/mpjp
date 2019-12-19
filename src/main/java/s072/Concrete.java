package s072;

// The type Concrete must implement the inherited abstract method
//public class Concrete extends Abstract {
//}

public class Concrete extends Abstract {// vogliamo il gatto concreto estendiamo quello astratto;
    @Override
    public void anAbstractMethod() {
        System.out.println("not abstract anymore");
    }
}
