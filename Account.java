import Discounts.BaseDiscount;
public class Account extends BaseDiscount{
    // add database
    static String name = "TestUser";
    static String address = "testplace";
    static String email = "bob@gmail";
    static String password = "TestPassword";
    static Boolean is_staff = true;

    static void change_details(String x, String y) {
        if (x.equals("name")) {
            name = y;
        } else if (x.equals("address")) {
            address = y;
        } else if (x.equals("email"))  {
            email = y;
        } else if (x.equals("password"))  {
            password = y; 
        }
        else{
            System.out.print("error change details incorrect input");
        }

    }
}
