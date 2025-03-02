package CakeApp;

public class Cake {
    private final String breadType;
    private final String creamFlavour;
    private final String decorateType;
    private final int bakeTime;

    public Cake(String breadType, String creamFlavour, String decorateType, int bakeTime) {
        this.breadType = breadType;
        this.creamFlavour = creamFlavour;
        this.decorateType = decorateType;
        this.bakeTime = bakeTime;
    }

    public void displayCake() {
        System.out.println("\nCake Details:");
        System.out.println("Bread Type: " + breadType);
        System.out.println("Cream Flavour: " + creamFlavour);
        System.out.println("Decoration: " + decorateType);
        System.out.println("Baking Time: " + bakeTime + " minutes");
        System.out.println("\nThe cake is ready to be served!");
}
}