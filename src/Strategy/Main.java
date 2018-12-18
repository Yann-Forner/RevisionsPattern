package Strategy;

public class Main {
    public static void main(String[] args) {
        //Initialisation strat
        AdditionnerStrat add= new AdditionnerStrat();
        DiviserStrat div= new DiviserStrat();
        SoustraireStrat sub= new SoustraireStrat();
        MultiplierStrat mul=new MultiplierStrat();
        //init var
        Double a = 3.0;
        Double b = 2.0;
        //test
        System.out.println("addition :");
        System.out.println(add.calcul(a,b));
        System.out.println("Soustraction");
        System.out.println(sub.calcul(a,b));
        System.out.println("Multiplication");
        System.out.println(mul.calcul(a,b));
        System.out.println("Division :");
        System.out.println(div.calcul(a,b));
    }
}
