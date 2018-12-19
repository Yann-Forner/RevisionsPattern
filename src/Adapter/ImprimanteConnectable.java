package Adapter;

public class ImprimanteConnectable implements Connectable {
    Imprimante getImp() {
        return imp;
    }
    private Imprimante imp;

    ImprimanteConnectable(Imprimante imp) {
        this.imp = imp;
    }


    @Override
    public void connecter() {
        System.out.println("ImprimanteConnectable connecté");
    }
}
