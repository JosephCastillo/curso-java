import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
       ReadFile readFile = new ReadFile();
       readFile.read();

    }
}

class ReadFile {

    ReadFile(){} // Constructor

    public void read() {
        try {
            FileReader entry = new FileReader("src/textTest.txt");

            BufferedReader myBufferedReader = new BufferedReader(entry);

            String line = "";

            while (true) {

                line = myBufferedReader.readLine();
                if (line == null) {
                    break; // Exit the loop if no more lines are available
                }
                System.out.println(line);
            }
            entry.close();
        } catch (Exception e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

    }
}