package factoryClass;

public class croissant implements pastryType{
    @Override
    public void pastryType(){
        System.out.println("inside croissant::pastryType() method");
    }
}
