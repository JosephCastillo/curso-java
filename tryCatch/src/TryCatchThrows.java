import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchThrows {

    public static void main(String[] args) {
        System.out.println("What do you want to do?");
        System.out.println("1. Enter data");
        System.out.println("2. Exit");

        Scanner enter = new Scanner(System.in);
        int option = enter.nextInt();

        if (option == 1) {
            try {
                askData();
            } catch (InputMismatchException e) {
                System.out.println("An input mismatch exception occurred: " + e.getMessage());
                System.out.println("Please enter a valid number for age.");
            }
        } else {
            System.out.println("Exiting the program.");
            System.exit(0);
        }
        enter.close();
    }

    public static void askData() throws InputMismatchException {
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter your name, please:");
        String name = enter.nextLine();
        System.out.println("Enter your age, please:");
        int age = enter.nextInt();
        System.out.println("Hello " + name + ", Next year, your age is  " + (age + 1) + " years old.");
        enter.close();
        System.out.println("Thank you for using the program!");

    }
}
