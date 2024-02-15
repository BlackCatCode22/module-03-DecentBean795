package myanimals;
import java.util.Scanner;

public class Animal {
    public static int numOfAnimals = 0;

    public Animal() {
        numOfAnimals++;
        System.out.println("Current number of animal objects: " + numOfAnimals);
    }

    public static int getNumOfAnimals() {
        return numOfAnimals;
    }

   
    public static class AnimalMenu {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Animal animal;
            String choice;

            do {
                System.out.println("Menu:");
                System.out.println("1. Create a Dog");
                System.out.println("2. Create a Cat");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        animal = new Dog();
                        break;
                    case "2":
                        animal = new Cat();
                        break;
                    case "3":
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        continue;
                }

                System.out.println("\n Current number of animal objects: " + Animal.getNumOfAnimals() + "\n");
            

            } while (true);
        }
    }
}



