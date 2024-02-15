package mystuff;
import java.util.Scanner;
public class Driver {

    public static void main(String[] args) {
        System.out.println("\n Hello from class Driver \n\n");

        Stuff myStuff = new Stuff();
        myStuff.item = "Laptop";
        myStuff.manufacturer = "Apple";
        myStuff.model = "2019  16 Inch MacBook Pro";
        myStuff.cost = 4500.00;
        myStuff.origin = "USA";

        Stuff myStuff2 = new Stuff();
        myStuff2.item = "Phone";
        myStuff2.manufacturer = "Apple";
        myStuff2.model = "iPhone 14 Pro Max";
        myStuff2.cost = 1200.00;
        myStuff2.origin = "USA"; 

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Choose an option:");
            System.out.println("1. Display myStuff1 class");
            System.out.println("2. Display myStuff2 class");
            System.out.println("0. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                System.out.println("\n The item is: " + myStuff.item + "\n");
                System.out.println("\n The manufacturer is: " + myStuff.manufacturer + "\n");
                System.out.println("\n The model is: " + myStuff.model + "\n");
                System.out.println("\n The cost is: " + myStuff.cost + "\n");
                System.out.println("\n The origin is: " + myStuff.origin + "\n");
                    break;
                case 2:
                System.out.println("\n The item is: " + myStuff2.item + "\n");
                System.out.println("\n The manufacturer is: " + myStuff2.manufacturer + "\n");
                System.out.println("\n The model is: " + myStuff2.model + "\n");
                System.out.println("\n The cost is: " + myStuff2.cost + "\n");
                System.out.println("\n The origin is: " + myStuff2.origin + "\n");;
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);
    }

}