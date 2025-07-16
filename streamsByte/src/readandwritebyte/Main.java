package readandwritebyte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        int count = 0; // Variable to count the number of bytes read
        try {
            File file = new File("src/readandwritebyte/fotoperfil.png"); // Specify the path to your file

            int fileSize = (int) file.length(); // cast to int for compatibility

            int[] fileBytes = new int[fileSize]; // Create an array to hold the file bytes

            FileInputStream fileInputStream = new FileInputStream(file); // Create a FileInputStream to read the fil

            int byteData;

            while ((byteData = fileInputStream.read()) != -1) {
                fileBytes[count] = byteData; // Store the byte in the array
                count++; // Increment the count
            }
            // Close the file input stream
            fileInputStream.close();
            // Create a new file with the read bytes
            createFile(fileBytes);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        System.out.println("total bytes read: " + count);

        // Call the method to create a new file with the read bytes
    }
    // Note: The fileBytes array now contains the bytes of the file.

    static void createFile(int[] bytes) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("src/readandwritebyte/fotoperfil_copy.png"); // Specify the output file path
            for (int byteData : bytes) {
                fileOutputStream.write(byteData); // Write each byte to the output file
            }
            fileOutputStream.close(); // Close the file output stream
        } catch (Exception e) {
            System.out.println("An error occurred while creating the file: " + e.getMessage());
        }
    }

}

