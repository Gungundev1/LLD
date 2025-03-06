package BehaviorialDesignPattern.Observer;

public class ConcreteObserver implements Observer{
    private String name;
    public ConcreteObserver(String name){
        this.name=name;
    }

    @Override
    public void update(String message) {
        System.out.println(name+"\nrecieved update:  "
        +message);
    }
}
