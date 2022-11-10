public class Delivery extends Orders {
    float standard_fee;
    float base_fee;

    public static void main(String[] args) {

        System.out.println(Account.name);
        System.out.println(Account.address);
        System.out.println(Account.email);
        Account.change_details("name", "callum");
        Account.change_details("address", "123 drive");
        Account.change_details("email", "Test@gmail.com");
        System.out.println(Account.name);
        System.out.println(Account.address);
        System.out.println(Account.email);
    }
}
