package CakeApp;

public class Cake {
    private  String breadType;
    private  String creamFlavour;
    private  String decorateType;
    private int bakeTime;

    public Cake(
            String breadType,String creamFlavour,String decorateType,int bakeTime
    ) {
        this.breadType=breadType;
            this.creamFlavour=creamFlavour;
            this.decorateType=decorateType;
            this.bakeTime=bakeTime;
    }


@Override
public String toString(){

        return "cake Details:" + "\nBreadType- " +breadType +"\ncreamflavour- "+ creamFlavour+"\nDecorationType- "+ decorateType+"\nBakeTime- "+bakeTime;

}


}









