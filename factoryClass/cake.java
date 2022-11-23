package factoryClass;

public class cake implements productType{
    @Override
    public void draw(){
        System.out.println("Inside cake :: create() method");
    }
}