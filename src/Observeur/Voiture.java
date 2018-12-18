package Observeur;

import java.util.ArrayList;
import java.util.List;

public class Voiture {
    private List<Observer> observers = new ArrayList<>();

    Integer getNombrePassager() {
        return nombrePassager;
    }

    private Integer nombrePassager=0;

    void addPassager(){
        ++nombrePassager;
        notifyAllObserver();
        if(nombrePassager==6){
            --nombrePassager;
        }
    }
    void subPassager(){
        --nombrePassager;
        notifyAllObserver();
        if(nombrePassager==-1){
            ++nombrePassager;
        }
    }

    void attachObserver(Observer o){
        observers.add(o);
    }
    private void notifyAllObserver(){
        for (Observer o:observers) {
            o.update();
        }
    }
}
