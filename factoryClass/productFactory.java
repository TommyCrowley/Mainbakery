package factoryClass;
public class productFactory {
    public productType getType(String x){
        if(x == null){
            return null;
        }
        if(x.equalsIgnoreCase("CAKE")) {
            if (x.equalsIgnoreCase("CHOC")) {
                return new cake();
            }
        }
        return null;
    }
}