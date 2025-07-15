import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

        ReadFile readFile = new ReadFile();
        readFile.read();


    }
}

class ReadFile {
    public void read() {
        try {
            FileReader entry = new FileReader("src/file.txt");
            int character;
            character = entry.read();

            // Read and print characters until the end of the file
            while (character != -1) {
                System.out.print((char) character);
                character = entry.read();
            }
            entry.close();
        }
        catch (Exception e) {
            System.out.println("File not found");
        }
    }
}
