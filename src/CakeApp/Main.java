package CakeApp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CakeBuilder builder = new CakeBuilder();
        Cake cake = new Cake();

        System.out.println("\nEnter the type of bread (e.g. White bread, Brown bread, Sponge bread, Chocolate bread):");
        String breadType = scanner.nextLine();
//        cake.setBread(breadType);

        System.out.println("\nEnter the type of cream (e.g. Chocolate, Vanilla, Strawberry):");
        String creamFlavour = scanner.nextLine();
        cake.addCreamFlavour(creamFlavour);

        System.out.println("\nEnter the baking time in minutes:");
        int bakeTime = scanner.nextInt();
        scanner.nextLine();
        cake.takeBakeTime(bakeTime);

        System.out.println("\nEnter the type of decoration (e.g. Fruits, Designs):");
        String decorateType = scanner.nextLine();
        cake.addDecorationType(decorateType);
        System.out.println("The cake is ready to be served!");


        builder.build();
        cake.displayCake();


//        public static void main(String[] args) {
//            Cake cake = new CakeBuilder()
//                    .addBreadTYpe("Chocolate Sponge")
//                    .addCreamFlavour("Vanilla Cream")
//                    .addDecorationType("Sprinkles")
//                    .takeBakeTime(30).build();
//
//            System.out.println("Your cake is ready: " +cake);


        scanner.close();
}
}
