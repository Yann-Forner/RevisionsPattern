package Strategy;

public class DiviserStrat implements Strategy {
    @Override
    public Double calcul(Double a, Double b) {
        return a/b;
    }
}
