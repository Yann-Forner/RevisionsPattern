package Factory;

import Factory.Production.UsineAix;
import Factory.Production.UsineLille;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Objets> sac = new ArrayList<>();
        UsineAix usineAix=new UsineAix();
        UsineLille usineLille=new UsineLille();
        sac.add(usineAix.fabriquer("cahier"));
        sac.add(usineLille.fabriquer("trousse"));
        sac.add(usineAix.fabriquer("pochette"));

        System.out.println(sac);
    }
}
