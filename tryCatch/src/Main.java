import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            //We simulate an IOException by trying to read a file that does not exist.
            BufferedReader lector = new BufferedReader(new FileReader("non_existent_file.txt"));
            String linea = lector.readLine();
            lector.close();


        } catch (IOException e) {
            System.out.println("An IOException occurred: " + e.getMessage());
        }

        try {
            //We simulate a RuntimeException (division by zero)
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (RuntimeException e) {
            System.out.println("A RuntimeException occurred " + e.getMessage());
        }

        System.out.println("The program continue after error handling.");
    }
}