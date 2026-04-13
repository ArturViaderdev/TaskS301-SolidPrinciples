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
            PasswordVerify passwordVerify = new PasswordVerify(password);
            try
            {
                emailVerify.verify();
                passwordVerify.verify();
                ConfirmEmail confirmEmail = new ConfirmEmail(email);
                confirmEmail.confirm();
                if(confirmEmail.checkConfirmed())
                {
                    System.out.println("User confirmed");

                }
                else
                {
                    System.out.println("User did not confirm registration.");
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
