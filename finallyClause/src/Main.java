import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose a option \n1: Square \n2: Rectangle \n3: Triangle \n4: Circle");
        try {
            figure = scanner.nextInt();
        }catch (Exception e) {
            System.out.println("Invalid input. Please enter a number between 1 and 4.");
        }finally {
            scanner.close();
        }
        switch (figure) {
            case 1:
                int side = Integer.parseInt(JOptionPane.showInputDialog("Enter the side:"));
                System.out.println(Math.pow(side, 2));
                break;

            case 2:
                int base = Integer.parseInt(JOptionPane.showInputDialog("Enter the base:"));
                int height = Integer.parseInt(JOptionPane.showInputDialog("Enter the height:"));
                System.out.println("Area of Rectangle: " + (base * height));
                break;
            case 3:
                base = Integer.parseInt(JOptionPane.showInputDialog("Enter the base:"));
                height = Integer.parseInt(JOptionPane.showInputDialog("Enter the height:"));
                System.out.println("Area of Triangle: " + (base * height) / 2);
                break;
            case 4:
                int radius = Integer.parseInt(JOptionPane.showInputDialog("Enter the radius:"));
                System.out.println("Area of Circle: " + (Math.PI * Math.pow(radius, 2)));
                break;
            default:
                System.out.println("Invalid option selected. Please choose a valid figure.");
        }
        int height = Integer.parseInt(JOptionPane.showInputDialog("Enter the height in cm:"));
        System.out.println("If you are a man, your ideal weight is: " + (height - 110) + " kg");
        System.out.println("If you are a woman, your ideal weight is: " + (height - 120) + " kg");

    }
    static int figure;
}
