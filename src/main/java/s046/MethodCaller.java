package s046;

public class MethodCaller {
    public static void main(String[] args) {
    	String s= Simple.h();
        System.out.println(s);
        
        Simple reference = new Simple(); // istanzia un oggetto di tipo Simple, è un reference locale e crea nuovo spazio in memoria, creo un nuovo cane che si chiama bob che appartiene alla mia classe cane;
        
        int result = reference.f(7, 6);
        System.out.println(result);
        
        reference.g(true);
        reference.g(false);
    }
}
