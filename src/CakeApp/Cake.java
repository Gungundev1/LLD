package CakeApp;

public class Cake {
    private  String breadType;
    private  String creamFlavour;
    private  String decorateType;
    private int bakeTime;

    public Cake() {}

    public void setBreadType(String breadType){
        this.breadType=breadType;
    }

    public void setCreamFlavour(String creamFlavour){
        this.creamFlavour=creamFlavour;
    }
    public void setDecorateType(String decorateType){
        this.decorateType=decorateType;
    }
    public void setBakeTime(int bakeTime){
        this.bakeTime=bakeTime;
    }

//@Override
//public String toString(){
//        return "cake Details:" + "\nBreadType-" +breadType +"\n creamflavour-"+ creamFlavour+"\nDecorationTYpe- "+ decorateType+"\nBakeTime-"+bakeTime+"";
//}
    public void displayCake() {
        System.out.println("Cake Details:");
        System.out.println("Bread Type: " + breadType);
        System.out.println("Cream Flavour: " + creamFlavour);
        System.out.println("Decoration: " + decorateType);
        System.out.println("Baking Time: " + bakeTime + " minutes");
}



}