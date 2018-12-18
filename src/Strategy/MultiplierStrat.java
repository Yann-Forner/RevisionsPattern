package Strategy;

public class MultiplierStrat implements Strategy {
    @Override
    public Double calcul(Double a, Double b) {
        return a*b;
    }
}
