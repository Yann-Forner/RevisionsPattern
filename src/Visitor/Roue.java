package Visitor;

public class Roue extends Voiture {
    @Override
    public void accepter(Visiteur v) {
        v.visiter(this);
    }
}
