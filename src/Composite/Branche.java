package Composite;

import java.util.ArrayList;

public class Branche extends Arbre {
    private ArrayList<Arbre> extension = new ArrayList<>();

    void ajouterArbre(Arbre arbre){
        extension.add(arbre);
    }
    @Override
    public void identifier() {
        System.out.println("je suis une branche-----");
        for (Arbre arbre :extension) {
            arbre.identifier();
        }

    }

    @Override
    public String toString() {
        return "Branche";
    }
}
