public class ConDemo {
    int roll;
    String name;
    float percentage;
    public ConDemo(int i,String j,float k){
        this.roll=i;
        this.name=j;
        this.percentage=k;

    }
public void display(){
    System.out.println("roll no is"  +roll);
    System.out.println("name is:" +name);
    System.out.println("percentage is" +percentage);

}
public static void main(String[] args) {
    ConDemo tv=new ConDemo(21, "tharun", 97.65f);
    tv.display();

}

    
}
