package Decorator;

public class VoitureLuxeDecorateur extends VoitureDecorateur {
    VoitureLuxeDecorateur(Voiture v) {
        super(v);
    }

    @Override
    public void rouler() {
        this.voiture.rouler();
        setVoitureLuxe(this.voiture);
    }

    private void setVoitureLuxe(Voiture voiture){
        System.out.println("voiture de luxe");
    }
}
