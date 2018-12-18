package Decorator;

public class Main {
    public static void main(String[] args) {
        Voiture voiture = new VoitureBasique();
        Voiture voitureLuxe = new VoitureLuxeDecorateur(new VoitureBasique());

        Voiture voitureLuxe4x4 = new VoitureLuxeDecorateur(new Voiture4x4());
        System.out.println("voiture basique :");
        voiture.rouler();

        System.out.println("voiture de luxe :");
        voitureLuxe.rouler();

        System.out.println("4x4 de luxe :");
        voitureLuxe4x4.rouler();
    }
}
