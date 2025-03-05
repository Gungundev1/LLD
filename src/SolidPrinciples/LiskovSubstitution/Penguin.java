package SolidPrinciples.LiskovSubstitution;

public class Penguin implements WalkingBird{
    @Override
    public void walk() {
        System.out.println("Penguins can only walking...");
    }
}
