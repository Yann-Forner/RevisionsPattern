package Composite;

public class Feuille extends Arbre {
    @Override
    public void identifier() {
        System.out.println("je suis une feuille");
    }

    @Override
    public String toString() {
        return "Feuille";
    }
}
