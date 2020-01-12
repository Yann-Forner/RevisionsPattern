package Iterator;

public class Main {


    public static void main(String[] args) {
        Parking parking = new Parking();
        parking.addVoiture(new Voiture("Renault"));
        parking.addVoiture(new Voiture("Range rover"));
        parking.addVoiture(new Voiture("Ford"));
        parking.addVoiture(new Voiture("Peugeot"));

        ParkingIterator parkingIterator = parking.iterator();
        while (parkingIterator.hasNext()){
            System.out.println(parkingIterator.next().getMarque());
        }
    }

}
