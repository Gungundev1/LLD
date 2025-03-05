package SolidPrinciples.LiskovSubstitution;

public class Parrot implements FlyingBird,WalkingBird{

    @Override
    public void fly() {
        System.out.println("Parrots are flying...");
    }

    @Override
    public void walk() {
        System.out.println("Parrots can also walk...");
    }
}
