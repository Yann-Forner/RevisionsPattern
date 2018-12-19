package Iterator;

public class Voiture {
    private Integer index;

    public Voiture(Integer index) {
        this.index = index;
    }

    Integer getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return "Voiture"+" "+index;
    }
}
