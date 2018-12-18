package Observeur;

public class ObserverChangement extends Observer {
    ObserverChangement(Voiture voiture) {
        this.v=voiture;
        v.attachObserver(this);
    }

    @Override
    public void update() {
        System.out.println("il y a eu un changement");
    }
}
