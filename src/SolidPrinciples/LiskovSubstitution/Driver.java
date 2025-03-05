package SolidPrinciples.LiskovSubstitution;

public class Driver {
    public static void main(String[] args) {
       Penguin penguin=new Penguin();
       penguin.walk();
       Parrot parrot=new Parrot();
       parrot.fly();
       parrot.walk();
    }
}
