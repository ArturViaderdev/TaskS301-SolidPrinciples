public class ConfirmEmail {
    private String email;
    public ConfirmEmail(String email)
    {
        this.email = email;
    }

    public void confirm()
    {
        System.out.println("📧 Sending confirmation email to: " + email);
    }

    public boolean checkConfirmed()
    {
        boolean userConfirmed = true;
        return userConfirmed;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
}
