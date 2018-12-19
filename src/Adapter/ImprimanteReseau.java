package Adapter;

public class ImprimanteReseau implements Imprimante {
    @Override
    public void imprimer() {
        System.out.println("je suis Imprimante Reseau");
    }
}
