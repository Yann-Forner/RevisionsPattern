package Adapter;

public class ImprimanteLocale implements Imprimante {
    @Override
    public void imprimer() {
        System.out.println("Je suis Imprimante Locale");
    }

}
