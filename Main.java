import java.util.Scanner;

import Discounts.BaseDiscount;
import Discounts.Discount;
import Discounts.TwoYearDiscount;

public class Main extends LogIn {
    public static void main(String[] args) {
        login();
        Controller();
    }

    public static void Controller()
    {
        Scanner in = new Scanner(System.in);
        String input;
        boolean running = true;

        System.out.println("Welcome to The Bakery!, please enter your query. Type 'help' to see a list of commands");
        while(running == true)
        {
            input = in.nextLine();
            if(input.equals("help")){
                System.out.println("Available commands: account, orders, products, quit");
            }
            else if(input.toLowerCase().equals("account")){
                System.out.println("Username: " + Account.name);
                System.out.println("Password: " + Account.password);
                System.out.println("Email: " + Account.email);
                System.out.println("Address: " + Account.address);
                System.out.println("Would you like to change your account details? y/n");
                input = in.nextLine();
                if(input.toLowerCase().equals("y"))
                {
                    System.out.println("What would you like to change?");
                    input = in.nextLine();
                    String changedDetail = input.toLowerCase();
                    System.out.println("Please enter the updated information: ");
                    input = in.nextLine();
                    Account.change_details(changedDetail, input);
                    System.out.println("Change saved!");
                }

            }
            else if(input.toLowerCase().equals("orders")){

            }
            else if(input.toLowerCase().equals("test")) {
                Discount testDiscount = new TwoYearDiscount(new BaseDiscount());
                System.out.println(testDiscount.getDescription());
                System.out.println(testDiscount.GetDiscount());

            }
            else if(input.toLowerCase().equals("quit")){
                running = false;
            }
            else{
                System.out.println("Invalid command, please try again. Type 'help' for a list of commands.");
            }
        }

        in.close();

    }
}
