import javax.swing.*;

public class TryCatchThrow {
    public static void main(String[] args) {

        String email = JOptionPane.showInputDialog("Enter your email address:");

        try {
            examineEmail(email);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
        }


    }

    public static void examineEmail(String email) throws IllegalArgumentException {

        if (email == null || !email.contains("@") || email.length() <= 3) {
            throw new IllegalArgumentException("Invalid email address.");
        }
        JOptionPane.showMessageDialog(null, "Email is valid: " + email);

    }
}
