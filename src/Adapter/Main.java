package Adapter;

public class Main {
    public static void main(String[] args) {
        ImprimanteReseau imprimanteReseau= new ImprimanteReseau();
        Cafetiere cafetiere = new Cafetiere();
        Chauffage chauffage = new Chauffage();
        ImprimanteConnectable impCo= new ImprimanteConnectable(new ImprimanteLocale());

        System.out.println("Imprimante réseau :");
        imprimanteReseau.imprimer();
        System.out.println("Cafetiere connectée :");
        cafetiere.connecter();
        System.out.println("Chauffage connecté :");
        chauffage.connecter();
        System.out.println("imprimante connectée :");
        impCo.connecter();
        impCo.getImp().imprimer();


    }
}
