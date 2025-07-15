package fileaccesswrite;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;

public class FileAccessWrite {
    public static void main(String[] args){
       WriteFile writeFileApp = new WriteFile();
       writeFileApp.writeFile();
    }
}

class WriteFile{
    public void writeFile(){
        // Display a message dialog to inform the user about the file location
        JOptionPane.showMessageDialog(null, "This program will write to a file named 'file.txt' in the 'src/fileaccesswrite' directory.");
        // Prompt the user to enter a phrase
        String phrase = JOptionPane.showInputDialog("Please enter a phrase to write to the file:");
        phrase = phrase + "\n"; // Add a newline character at the end of the phrase
        try{
            FileWriter writer = new FileWriter("src/fileaccesswrite/file.txt", true); // 'true' for append mode
            for (int i = 0; i < phrase.length(); i++) {
                writer.write(phrase.charAt(i));
            }
            writer.close();
        }catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }
    }
}
