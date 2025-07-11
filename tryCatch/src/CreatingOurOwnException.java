import javax.swing.*;

public class CreatingOurOwnException {
    public static void main(String[] args) {
        String email = JOptionPane.showInputDialog("Enter your email address:");
        try {
            examineEmail(email);
        } catch (Exception e) {
            System.out.println("Email should contain '@' and be longer than 3 characters.");
            e.printStackTrace();
        }
    }

    public static void examineEmail(String email) throws InvalidEmailException {

        if (email == null || !email.contains("@") || email.length() <= 3) {
            throw new InvalidEmailException();
        }
        JOptionPane.showMessageDialog(null, "Email is valid: " + email);

    }
}

class InvalidEmailException extends Exception {
    public InvalidEmailException() {
    }

    public InvalidEmailException(String messageError) {
        super(messageError);
    }
}