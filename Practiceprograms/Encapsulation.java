 class StudentInformation{
private String name;
private int rollno;
private String branch;
public String getName(){
    return name;
}
public void setName(String a){
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
