package Factory.Production;

import Factory.Cahier;
import Factory.Objets;
import Factory.Pochette;
import Factory.Trousse;

public abstract class UniteProduction {
    public Objets cree(String type){
        switch (type){
            case("trousse"):
                return new Trousse();
            case("cahier"):
                return new Cahier();
            case("pochette"):
                return new Pochette();
            default:
                try {
                    throw new ClassNotFoundException();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
        }
        return null;
    }
    public abstract Objets fabriquer(String type);
}
