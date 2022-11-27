package factoryClass;

public class pastry implements productType{
    @Override
    public void create(){
        System.out.println("Inside pastry::draw() method");
    }
}
