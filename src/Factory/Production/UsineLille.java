package Factory.Production;

import Factory.Objets;

public class UsineLille extends UniteProduction {
    @Override
    public Objets fabriquer(String type) {
        System.out.println("création d'un(e) "+type+" à la fabrique de LILLE");
        return cree(type);
    }
}
