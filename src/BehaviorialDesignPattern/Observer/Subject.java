package BehaviorialDesignPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers=new ArrayList<>();
    private String message;
    public void add (Observer observer){
        observers.add(observer);
    }
    public void remove(Observer observer){
        observers.remove(observer);
    }

    public void notifyObserver(){
        for (Observer observer:observers){
            observer.update(message);
        }
    }
    public void setUpdate(String message){
        this.message=message;
        notifyObserver();
    }
}
