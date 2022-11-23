package factoryClass;
public class productFactory {
    public productType getType(String x){
        if(x == null){
            return null;
        }
        if(x.equalsIgnoreCase("CAKE")) {
            if (x.equalsIgnoreCase("CHOC")) {
                return (productType) new chocCake();
            }
        } else if (x.equalsIgnoreCase("PASTRY")) {
            if(x.equalsIgnoreCase("CROISSANT")){
                return (productType) new croissant();
            }
        }
        return null;
    }
}