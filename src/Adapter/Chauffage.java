package Adapter;

public class Chauffage implements Connectable {
    @Override
    public void connecter() {
        System.out.println("chauffage connecté");
    }
}
