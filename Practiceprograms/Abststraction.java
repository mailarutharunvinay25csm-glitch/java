abstract class Cricket{
public  abstract void batting();
public void bowling(){
    System.out.println("he is bowller");
}
} 
class Allrounder extends Cricket{
    @Override
    public void batting(){
        System.out.println("HE IS BATSMAN");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Allrounder tv=new Allrounder();
        tv.bowling();
        tv.batting();
        
    }
    
}
