package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Parking implements Iterable{
    private ArrayList<Voiture> mesVoitures= new ArrayList<>();

    public Parking() {

    }

    public void addVoiture(Voiture v) {
        mesVoitures.add(v);
    }

    @Override
    public ParkingIterator iterator() {
        return new ParkingIterator(this);
    }


    public int nbOfCars(){
        return this.mesVoitures.size();
    }

    public Voiture get(int i){
        return mesVoitures.get(i);
    }
}
