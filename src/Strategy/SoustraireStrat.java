package Strategy;

public class SoustraireStrat implements Strategy {
    @Override
    public Double calcul(Double a, Double b) {
        return a-b;
    }
}
