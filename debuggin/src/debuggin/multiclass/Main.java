package debuggin.multiclass;

public class Main {
    public static void main(String[] args) {
        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();

        // Example usage
        System.out.println("Addition: " + (5 + 3));
        System.out.println("Subtraction: " + (5 - 3));
        System.out.println("Multiplication: " + (5 * 3));
        System.out.println("Division: " + (5 / 3.0));
    }
}
