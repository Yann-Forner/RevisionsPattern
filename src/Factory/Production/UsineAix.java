package Factory.Production;

import Factory.Objets;

public class UsineAix extends UniteProduction {
    @Override
    public Objets fabriquer(String type) {
        System.out.println("création d'un(e) "+type+" à l'usine de AIX");
        return cree(type);
    }
}
