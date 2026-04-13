import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String email;
    private String password;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void register() {
            EmailVerify emailVerify = new EmailVerify(email);
            try
            {
                emailVerify.verify();
                if (password == null || password.length() < 8 || !password.matches(".*[A-Z].*")) {
                    throw new IllegalArgumentException("Password must be at least 8 characters long and contain an uppercase letter.");
                }

                System.out.println("📧 Sending confirmation email to: " + email);

                boolean userConfirmed = true;
                if (!userConfirmed) {
                    System.out.println("⚠️ User did not confirm registration.");
                    return;
                }
            }
            catch(IllegalArgumentException ex)
            {
                System.out.println(ex.getMessage());
            }
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

}
