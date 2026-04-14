public class Register {
    public Register()
    {
    }

    public User register(String name, String email, String password) throws IllegalArgumentException
    {
        EmailVerify emailVerify = new EmailVerify(email);
        PasswordVerify passwordVerify = new PasswordVerify(password);
        emailVerify.verify();
        passwordVerify.verify();
        ConfirmEmail confirmEmail = new ConfirmEmail(email);
        confirmEmail.confirm();
        if(confirmEmail.checkConfirmed())
        {
            return new User(name,email,password);
        }
        else
        {
            return null;
        }
    }
}
