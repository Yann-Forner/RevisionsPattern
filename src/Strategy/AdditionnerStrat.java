package Strategy;

public  class AdditionnerStrat implements Strategy{
    @Override
    public Double calcul(Double a, Double b) {
        return a+b;
    }
}
