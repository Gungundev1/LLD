package BehaviorialDesignPattern.CommandLine;

public class LightOn implements Command{


    @Override
    public void execute() {
        System.out.println("Light is turning On");
    }
}
