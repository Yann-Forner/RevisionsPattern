package Decorator;

public class VoitureBasique implements Voiture {
    VoitureBasique() {
    }

    @Override
    public void rouler() {
        System.out.println("rouler");
    }
}
