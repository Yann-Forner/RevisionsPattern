package Visitor;

public class Carroserie extends Voiture {
    @Override
    public void accepter(Visiteur v) {
        v.visiter(this);
    }
}
