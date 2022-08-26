import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Cupcake> cupcakeMenu = new ArrayList<Cupcake>();

        Cupcake cupcake = new Cupcake();
        RedVelvet redVelvet = new RedVelvet();
        Chocolate chocolate = new Chocolate();

        ArrayList<Drink> drinkMenu = new ArrayList<Drink>();

        Drink water = new Drink();
        Soda soda = new Soda();
        Milk milk = new Milk();


        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on the menu but we need to decide on pricing.\n");

        Scanner input = new Scanner(System.in);

        //------------Cupcake-----------

        System.out.println("We are deciding on the price for our standard cupcake. Here is the description:");

        cupcake.type();

        System.out.println("\nHow much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)");

        String priceText = input.nextLine();

        double price = Double.parseDouble(priceText);

        cupcake.setPrice(price);

        //--------Red Velvet-------------

        System.out.println("\nWe are deciding on the price for our red velvet cupcake. Here is the description: ");

        redVelvet.type();

        System.out.println("\nHow much would you like to charge for the red velvet cupcake? (Input a numerical number taken to 2 decimal places)");

        priceText = input.nextLine();

        price = Double.parseDouble(priceText);

        redVelvet.setPrice(price);

        //--------Chocolate-------------

        System.out.println("\nWe are deciding on the price for our chocolate cupcake. Here is the description: ");

        chocolate.type();

        System.out.println("\nHow much would you like to charge for the chocolate cupcake? (Input a numerical number taken to 2 decimal places)");

        priceText = input.nextLine();

        price = Double.parseDouble(priceText);

        chocolate.setPrice(price);
        //-------------------------------------------

        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);

        //-------------------------------------------

        System.out.println("\nWe are in the middle of creating the drink menu. We currently have three drinks on the menu but we need to decide on pricing.");


        //--------Water-----------

        System.out.println("\nWe are deciding on the price for our generic drink, water. Here is the description: ");

        water.type();

        System.out.println("\nHow much would you like to charge for the bottle of water? (Input a numerical number taken to 2 decimal places)");

        priceText = input.nextLine();

        price = Double.parseDouble(priceText);

        water.setPrice(price);

        //--------Soda-------------

        System.out.println("\nWe are deciding on the price for soda. Here is the description: ");

        soda.type();

        System.out.println("\nHow much would you like to charge for a bottle of soda? (Input a numerical number taken to 2 decimal places)");

        priceText = input.nextLine();

        price = Double.parseDouble(priceText);

        soda.setPrice(price);

        //-----------Milk---------------

        System.out.println("\nWe are deciding on the price for milk. Here is the description: ");

        milk.type();

        System.out.println("\nHow much would you like to charge for a bottle of milk? (Input a numerical number taken to 2 decimal places)");

        priceText = input.nextLine();

        price = Double.parseDouble(priceText);

        milk.setPrice(price);

        //---------------------------------

        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);

        //---------------------------------

        new Order(cupcakeMenu, drinkMenu);

    }

    public static class Cupcake {
        public double price;

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void type() {
            System.out.println("A basic, generic cupcake, with vanilla frosting");
        }
    }

    public static class RedVelvet extends Cupcake {

        public void type() {
         System.out.println("A red velvet based cupcake, with cream cheese frosting.");
        }
    }

    public static class Chocolate extends Cupcake {

        public void type() {
            System.out.println("A chocolate based cupcake, with chocolate frosting.");
        }
    }

    public static class Drink {
        public double price;

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void type() {
            System.out.println( "Bottle of water");
        }
    }

    public static class Soda extends Drink {

        public void type() {
            System.out.println( "Bottle of soda");
        }
    }

    public static class Milk extends Drink {

        public void type() {
            System.out.println( "Bottle of milk");
        }
    }


}