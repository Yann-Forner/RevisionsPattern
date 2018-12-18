package Visitor;

public interface Visiteur {
    void visiter(Roue r);
    void visiter(Moteur m);
    void visiter(Carroserie c);
}
