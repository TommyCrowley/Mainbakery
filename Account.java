import javax.swing.DefaultBoundedRangeModel;

public class Account extends Delivery {
    // add database
    static String name = "Callum";
    static String address = "testplace";
    static String email = "bob@gmail";
    static String password = "Test";
    static Boolean is_staff;

    static void change_details(String x, String y) {
        switch(x.toLowerCase()){
        case "name":
            name = y;
            break;
        case "address":
            address = y;
            break;
        case "email":
            email = y;
            break;
        case "password":
            password = y;
        default:
            System.out.println("Error invalid input");
        }
    }
}
