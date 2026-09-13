class caluculator{
    public int add(int a,int b){ 
return a+b;
    }
    public int add(int a,int b,int c){    //overloading
        return a+b+c;

    }
    public double add(int a,double b,int c){   //overloading
        return a+b+c;
    }

}
public class MethodOverloading {
    public static void main(String[] args) {
        caluculator tv=new caluculator();
        int res=tv.add(20,30,40);
        System.out.println("req sum is"+res);
        double result=tv.add(20,30.5,60);
        System.out.println("result is "+result);

    }
    
}
