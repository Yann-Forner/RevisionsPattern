package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Parking implements Iterable<Voiture> {
    private ArrayList<Voiture> park = new ArrayList<Voiture>();
    void addVoiture(Voiture v){
        park.add(v);
    }
    @Override
    public Iterator<Voiture> iterator() {
        return new Iterator<Voiture>() {


            Voiture vIter =findFirst();
            @Override
            public boolean hasNext() {
                for (Voiture v: park) {
                    if(v.getIndex() > vIter.getIndex())return true;
                }
                return false;
            }

            @Override
            public Voiture next() {
                ArrayList<Voiture>voituresNextPot=new ArrayList<>();
                if(hasNext()){
                    for (Voiture v: park) {
                        if(v.getIndex()> vIter.getIndex())voituresNextPot.add(v);
                    }
                    Voiture vTemp = new Voiture(1000);
                    for (Voiture v: voituresNextPot) {
                               if(v.getIndex() < vTemp.getIndex())vTemp=v;
                    }
                    vIter=vTemp;
                    return vTemp;
                }
                return vIter;
            }

            Voiture findFirst(){
                park.add(new Voiture(0));
                Voiture vTemp=new Voiture(1000);
                for (Voiture v: park) {
                    if(v.getIndex() < vTemp.getIndex())vTemp=v;
                }
                return vTemp;
            }
        };
    }
}
