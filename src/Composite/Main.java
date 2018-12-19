package Composite;

public class Main {
    public static void main(String[] args) {
        Branche branche = new Branche();
        Branche branche1 = new Branche();
        Branche branche2 = new Branche();

        branche.ajouterArbre(branche1);
        branche.ajouterArbre(branche2);

        branche1.ajouterArbre(new Feuille());
        branche1.ajouterArbre(new Feuille());

        branche2.ajouterArbre(new Feuille());
        branche.identifier();
    }
}
