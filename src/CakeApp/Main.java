package CakeApp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Cake cake = new Cake();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter the type of bread(e.g. White bread, Brown bread, sponge bread, chocolate bread):");
        String breadType = scanner.next();
        cake.prepareBread(breadType);

        System.out.println("\nEnter the type of cream(e.g. chocolate , vanilla and more)");
        String creamFlavour = scanner.next();
        cake.addCream(creamFlavour);

        System.out.println("\nEnter the baking time: ");
        int bakeTime = scanner.nextInt();
        cake.bakeCake(bakeTime);

        System.out.println("\nEnter the type of decoration(e.g. fruits, designs ");
        String decorateType = scanner.next();
        cake.decorate(decorateType);
        System.out.println("\nThe cake is ready for served!");
        scanner.close();


    }
}


