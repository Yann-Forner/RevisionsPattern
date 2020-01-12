package Iterator;

import java.util.Iterator;

public class ParkingIterator implements Iterator<Voiture> {
    private int pos = 0;
    private Parking parking;

    public ParkingIterator(Parking parking) {
        this.parking = parking;
    }

    @Override
    public boolean hasNext() {
        return pos <= this.parking.nbOfCars()-1;
    }

    @Override
    public Voiture next() {
        return parking.get(pos++);
    }
}
