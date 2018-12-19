package Iterator;


public class Main {
    public static void main(String[] args) {
        Parking park = new Parking();

        park.addVoiture(new Voiture(2));
        park.addVoiture(new Voiture(13));
        park.addVoiture(new Voiture(11));
        park.addVoiture(new Voiture(4));
        park.addVoiture(new Voiture(5));

        for (Voiture v : park) {
            System.out.println(v);
        }
    }
}
