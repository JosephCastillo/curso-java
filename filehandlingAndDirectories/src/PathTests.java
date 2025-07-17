import java.io.File;

public class PathTests {
    public static void main(String[] args) {

        File file = new File("out");
        System.out.println("File exists: " + file.getAbsolutePath());
        System.out.println("Exists: " + file.exists());

    }
}
