import javax.swing.*;

public class HandlingMultipleExceptions {

    public static void main(String[] args) {

        try {
            division();
        } catch (ArithmeticException e) {
            System.out.println("An ArithmeticException occurred: " + e.getMessage());
            System.out.println("You cannot divide by zero. Please enter a valid divisor.");
            System.out.println("Exception type: " + e.getClass().getName());
        } catch (NumberFormatException e) {
            System.out.println("A NumberFormatException occurred: " + e.getMessage());
            System.out.println("Please enter valid integers for dividend and divisor.");
            System.out.println("Exception type: " + e.getClass().getName());
        }
    }

    static void division() {

        int num1 = Integer.parseInt((JOptionPane.showInputDialog("Enter the dividend:")));
        int num2 = Integer.parseInt((JOptionPane.showInputDialog("Enter the divisor:")));
        System.out.println("The result of the division is: " + num1 / num2);


    }
}