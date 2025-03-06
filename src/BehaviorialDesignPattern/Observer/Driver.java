package BehaviorialDesignPattern.Observer;

public class Driver {
    public static void main(String[] args) {
        Subject subject=new Subject();
        Observer observer=new ConcreteObserver("Subscriber1") ;
         Observer observer1=new ConcreteObserver("Subscriber2");
        subject.add(observer);
        subject.add(observer1);
        subject.setUpdate("video is uploaded");
        subject.setUpdate("you received a video");
        subject.remove(observer);
        subject.remove(observer1);

    }
}
