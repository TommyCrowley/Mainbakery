package factoryClass;

public class cake implements productType{
    @Override
    public void create(){
        System.out.println("Inside cake :: draw() method");
    }
}