public class Register {
    private User user;
    public Register(User user)
    {
        this.user = user;
    }

    public void register()
    {
        EmailVerify emailVerify = new EmailVerify(user.getEmail());
        PasswordVerify passwordVerify = new PasswordVerify(user.getPassword());
        try
        {
            emailVerify.verify();
            passwordVerify.verify();
            ConfirmEmail confirmEmail = new ConfirmEmail(user.getEmail());
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

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }
}
