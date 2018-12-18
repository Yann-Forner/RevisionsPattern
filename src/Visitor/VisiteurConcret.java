package Visitor;

public class VisiteurConcret implements Visiteur {
    @Override
    public void visiter(Roue r) {
        System.out.println("je roule");
    }

    @Override
    public void visiter(Moteur m) {
        System.out.println("je fais vroum vroum");
    }

    @Override
    public void visiter(Carroserie c) {
        System.out.println("j'ai pas d idées");
    }
}
