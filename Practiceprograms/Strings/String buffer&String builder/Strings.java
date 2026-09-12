public class Strings {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("india");  
        System.out.println(sb.capacity());  //stringbuffer capacity is 16 and it will give 21(16+5)
        String tv="great";
                System.out.println(tv);
      
        
        
     String name=new String("tharun");
     System.out.println(name.length());
       name= name.concat(" vinay");
       System.out.println(name);
       name =name +" sports person";
       System.out.println(" "+name);
    

       System.out.println(name.length());
       
  
    
       System.out.println(name.charAt(23));

      
}}
