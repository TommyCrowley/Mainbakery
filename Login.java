import java.util.Scanner;
public class Login{

     public void login()
     {
        Scanner in = new Scanner(System.in);
        String input;
        boolean done = false;
        System.out.println("Welcome, please log in");
        while(done == false)
        {
            System.out.println("Username: ");
            input = in.nextLine();
            if(input.equals(Account.name))
            {
                System.out.println("Password: ");
                input = in.nextLine();
                
                if(input.equals(Account.password))
                {
                    done = true;
                }
                else{
                    System.out.println("Invalid password, please try again");
                }
            }
            else{
                System.out.println("Invalid username, please try again");
            }
        }
     }
}
