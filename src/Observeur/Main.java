package Observeur;

public class Main {
    public static void main(String[] args) {
        Voiture v = new Voiture();
        ObserverChangement o = new ObserverChangement(v);
        ObserverLimite o2 = new ObserverLimite(v);
        v.addPassager();
        v.subPassager();
        v.subPassager();
        v.subPassager();
        for (int i = 0; i <6 ; i++) {
            v.addPassager();
        }
    }
}
