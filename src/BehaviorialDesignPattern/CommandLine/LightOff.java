package BehaviorialDesignPattern.CommandLine;

public class LightOff implements Command {
   private LightOn light;
//   public LightOff(LightOn light){
//       this.light=light;
//   }

    @Override
    public void execute() {
        System.out.println("Light is turning Off");
    }
}
