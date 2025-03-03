package CakeApp;

public class Cake {
    private    String breadType;
    private  String creamFlavour;
    private  String decorateType;
    private int bakeTime;

    public Cake() {}

    public void setBread(String breadType){
        this.breadType=breadType;
    }

    public void addCreamFlavour(String creamFlavour){
        this.creamFlavour=creamFlavour;
    }
    public void addDecorationType(String decorateType){
        this.decorateType=decorateType;
    }
    public void takeBakeTime(int bakeTime){
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
        System.out.println("The cake is ready to be served!");
}



}