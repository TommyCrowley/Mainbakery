import java.util.ArrayList;

import factoryClass.productFactory;
import factoryClass.productType;

public class Order {
    ArrayList<productType> products = new ArrayList<productType>();
    // add database
    static String accountname = "TestUser";
    static String address = "testplace";
    Boolean delivered = false;
    Boolean paid = false;

    public String getOrder(String orderId){
        String output;

        for (productType product : products) {
            output = output + product.toString();
        }

        return("current order = " + output);

    }

    public String addOrder(productType newProd){
        try{
            products.add(newProd);
            return newProd.toString();
        }
        catch(Exception e){
            return ("could not add :" + newProd.toString());
        }
    }

    public String getAccountName(){

    }
    public String getAddress(){

    }
    public boolean getdelivered(){

    }

}
