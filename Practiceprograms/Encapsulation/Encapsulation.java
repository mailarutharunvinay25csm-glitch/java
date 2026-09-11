 class StudentInformation{
private String name;   //if we use private keyword-access with in the same class only(used when we want to hide some details)
private int rollno;
private String branch;
public String getName(){  // read/access a private variable from outside the class in a controlled way.
    return name;
}
public void setName(String a){  /set or modify the value of a private variable from outside the class.
    name=a;
}
public int getRollno(){
    return rollno;
}
public void setRollno(int b){
rollno=b;

}
public String getBranch(){
    return branch;
}
public void setBranch(String c){
    branch=c;

}

 }
public class Encapsulation {
    public static void main(String[] args) {
        StudentInformation tv=new StudentInformation();
        tv.setName("tharun");
        tv.setRollno(232);
        tv.setBranch("csm");
        System.out.println(" name:"+ tv.getName()+" rollno:"+ tv.getRollno()+" branch:"+tv.getBranch());

    }
    
}
