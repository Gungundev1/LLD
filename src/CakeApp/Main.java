package CakeApp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CakeBuilder builder = new CakeBuilder();

        System.out.println("\nEnter the type of bread (e.g. White bread, Brown bread, Sponge bread, Chocolate bread):");
        String breadType = scanner.nextLine();
        builder.setBreadType(breadType);

        System.out.println("\nEnter the type of cream (e.g. Chocolate, Vanilla, Strawberry):");
        String creamFlavour = scanner.nextLine();
        builder.setCreamFlavour(creamFlavour);

        System.out.println("\nEnter the baking time in minutes:");
        int bakeTime = scanner.nextInt();
        scanner.nextLine(); // consume newline
        builder.setBakeTime(bakeTime);

        System.out.println("\nEnter the type of decoration (e.g. Fruits, Designs):");
        String decorateType = scanner.nextLine();
        builder.setDecorateType(decorateType);
Cake cake =new Cake(breadType,creamFlavour,decorateType,bakeTime);

        cake.displayCake();

        scanner.close();
}
}