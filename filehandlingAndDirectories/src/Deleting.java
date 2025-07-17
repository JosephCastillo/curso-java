import java.io.File;

public class Deleting {

    public static void main(String[] args) {

        File rute = new File("C:\\Users\\User\\OneDrive - Joseph\\Documentos\\curso-java\\filehandlingAndDirectories" + "\\testFile.txt");

        // Check if the file exists before attempting to delete it
        if (!rute.exists()) {
            System.out.println("The file does not exist: " + rute.getAbsolutePath());
            return; // Exit if the file does not exist
        }
        if (rute.delete()){
            // Deletes the file
            System.out.println("File deleted successfully: " + rute.getAbsolutePath());
        }

    }


}
