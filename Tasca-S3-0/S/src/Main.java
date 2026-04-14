public class Main {
    public static void main(String[] args)
    {
        String name = "Antonio";
        String email = "antonio@gmail.com";
        String password = "ABCDEFGHI";
        Register register = new Register();
        try
        {
            User user = register.register(name,email,password);
            if(user==null)
            {
                System.out.println("User not confirmed email");
            }
            else
            {
                System.out.println("User " + user.getName() + " confirmed.");
            }
        }
        catch(IllegalArgumentException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
