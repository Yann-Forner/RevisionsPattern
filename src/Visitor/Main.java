package Visitor;

public class Main {
    public static void main(String[] args) {
       VisiteurConcret visiteurConcret = new VisiteurConcret();
       Moteur m = new Moteur();
       Roue r = new Roue();
       Carroserie c = new Carroserie();
       test(m,visiteurConcret);
       test(r,visiteurConcret);
       test(c,visiteurConcret);
    }
    private static void test(Voiture voiture, Visiteur v){
        voiture.accepter(v);
    }
}
