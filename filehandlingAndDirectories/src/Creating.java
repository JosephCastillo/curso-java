import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Creating {

    public static void main(String[] args) {

        File rute = new File("C:\\Users\\User\\OneDrive - Joseph\\Documentos\\curso-java\\filehandlingAndDirectories" + "\\testFile.txt");

        // Check if the directory already exists
        if (rute.exists()) {
            System.out.println("The directory already exists: " + rute.getAbsolutePath());
            //return; // Exit if the directory already exists
        }

        // rute.mkdir(); // Creates the directory and any necessary parent directories

        String fileDestination = rute.getAbsolutePath();

        try {
            if (rute.createNewFile()) {
                // Creates the file if it does not exist
                System.out.println("File created successfully: " + rute.getAbsolutePath());
            }
        } catch (
                Exception e) {
            System.out.println("An error occurred while creating the file: " + e.getMessage());

        }

        Writing access = new Writing();
        access.writing(fileDestination);

    }

}

class Writing {

    public Writing() {
    }

    public void writing(String fileDestination) {

        String phase = "This is a test file created by Java.";

        try {
            FileWriter writer = new FileWriter(fileDestination, true); // 'true' to append to the file
            System.out.println(phase.length());
            writer.write(phase + "\n");

            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}