package CakeApp;

import java.lang.String;
import java.util.Scanner;

public class Cake {

    private  String breadType;
    private  String creamFlavour;
    private  String decorateType;
    private int bakeTime ;
    public   void prepareBread(String breadType) {
        System.out.println("Preparing: " + breadType + " bread....");
    }

    public void addCream(String creamFlavour) {
        System.out.println("Adding " + creamFlavour + " on the bread...");
    }

    public void bakeCake(int bakeTime) {
        System.out.println("Baking the cake for " + bakeTime + " minutes...");
    }

    public void decorate(String decorateType) {
        System.out.println("Decorating the cake with " + decorateType + "...");
    }

    public void serveCake() {
        System.out.println("The cake is ready for served!");
    }
}

