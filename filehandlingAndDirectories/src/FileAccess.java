import java.io.File;

public class FileAccess {
    public static void main(String[] args){

        File rute = new File("C:\\Users\\User\\OneDrive - Joseph\\Documentos\\curso-java\\filehandlingAndDirectories");
        System.out.println("File exists: " + rute.getAbsolutePath());

        String [] files = rute.list();

        if(files == null) {
            System.out.println("The directory is empty or does not exist.");
            return;
        }
        for (int i = 0; i < files.length; i++) {
            System.out.println("File " + (i + 1) + ": " + files[i]);
            File file = new File(rute, files[i]);
            if (file.isDirectory()){
                String [] subFiles = file.list();
                if(subFiles != null) {
                    System.out.println("Subdirectory " + files[i] + " contains:");
                    for (String subFile : subFiles) {
                        System.out.println(" - " + subFile);
                    }
                } else {
                    System.out.println("Subdirectory " + files[i] + " is empty or does not exist.");
                }
            }
        }
    }
}
