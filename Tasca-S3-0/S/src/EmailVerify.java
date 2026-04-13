public class EmailVerify {
    private String email;

    public EmailVerify(String email)
    {
        this.email = email;
    }

    public void verify()
    {
        if (email == null || !email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("Invalid email address.");
        }
    }

    public String getEmail()
    {
        return email;
    }
}
