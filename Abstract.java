 abstract class Vehicle{
    public void typeOfVehicle(){
        System.out.println("Four wheelers");

    }
    public abstract void speed();

    
}
class Car extends Vehicle{
    @Override
    public void speed(){
        System.out.println("150kmph");
    }


}
public class AbstractClasses{
    public static void main(String[] args) {
        Car tv=new Car();
        tv.speed();
        tv.typeOfVehicle();

        
    }


}
