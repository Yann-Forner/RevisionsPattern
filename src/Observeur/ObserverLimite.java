package Observeur;

public class ObserverLimite extends Observer {
    ObserverLimite(Voiture voiture) {
        this.v=voiture;
        v.attachObserver(this);
    }

    @Override
    public void update() {

        if(v.getNombrePassager().equals(6)){
            System.out.println("trop de passagers ! un d'eux sors");
        }else if(v.getNombrePassager().equals(-1)){
            System.out.println("Il n'y a pas de passagers ! on ne peux donc pas faire sortir un passager");
        }else{
            System.out.println("Passagers ="+v.getNombrePassager());
        }
    }
}
