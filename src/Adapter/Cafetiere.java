package Adapter;

public class Cafetiere implements Connectable {
    @Override
    public void connecter() {
        System.out.println("cafetière connecté");
    }
}
