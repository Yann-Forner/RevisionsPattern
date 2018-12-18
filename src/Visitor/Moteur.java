package Visitor;

public class Moteur extends Voiture {
    @Override
    public void accepter(Visiteur v) {
        v.visiter(this);
    }
}
