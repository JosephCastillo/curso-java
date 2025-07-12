import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int elements = Integer.parseInt(JOptionPane.showInputDialog("Enter the elements of the array:"));
        int randomNum[] = new int[elements];
        for (int i = 0; i < randomNum.length; i++) {
            // Remove the parentheses in (int) (Math.random() * 100) for debugging.
            // Like this: randomNum[i] = (int) Math.random() * 100;
            // You will see that some array elements will be 0 due to operator precedence.
            randomNum[i] = (int) (Math.random() * 100);
        }
        for (int element : randomNum) {
            System.out.println(element);
        }
    }
}