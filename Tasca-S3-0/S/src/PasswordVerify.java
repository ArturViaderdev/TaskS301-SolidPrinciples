public class PasswordVerify {
    private String password;

    public PasswordVerify(String password)
    {
        this.password = password;
    }

    public void verify()
    {
        if (password == null || password.length() < 8 || !password.matches(".*[A-Z].*")) {
            throw new IllegalArgumentException("Password must be at least 8 characters long and contain an uppercase letter.");
        }
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}
