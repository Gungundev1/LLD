package BehaviorialDesignPattern.CommandLine;

public class Driver {
    public static void main(String[] args) {

LightOn on=new LightOn();
on.execute();
LightOff off =new LightOff();
off.execute();
    }
}
