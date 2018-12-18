package Decorator;

public abstract class VoitureDecorateur implements Voiture {
    Voiture voiture;

    VoitureDecorateur(Voiture voiture) {
        this.voiture = voiture;
    }
    @Override
    public void rouler(){
        voiture.rouler();
    }
}
