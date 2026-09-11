public class StringOperations {
    public static void main(String[] args) {

        String str = "Hello Java";
        String str2 = "hello java";

        // 1. length()
        System.out.println(str.length()); 
        // Output: 10

        // 2. charAt()
        System.out.println(str.charAt(1)); 
        // Output: e

        // 3. concat()
        System.out.println(str.concat(" Programming")); 
        // Output: Hello Java Programming

        // 4. equals()
        System.out.println(str.equals("Hello Java")); 
        // Output: true

        // 5. equalsIgnoreCase()
        System.out.println(str.equalsIgnoreCase(str2)); 
        // Output: true

        // 6. toUpperCase()
        System.out.println(str.toUpperCase()); 
        // Output: HELLO JAVA

        // 7. toLowerCase()
        System.out.println(str.toLowerCase()); 
        // Output: hello java

        // 8. substring()
        System.out.println(str.substring(6)); 
        // Output: Java

        // 9. substring(start, end)
        System.out.println(str.substring(0, 5)); 
        // Output: Hello

        // 10. indexOf()
        System.out.println(str.indexOf("Java")); 
        // Output: 6

        // 11. lastIndexOf()
        System.out.println(str.lastIndexOf("a")); 
        // Output: 9

        // 12. contains()
        System.out.println(str.contains("Java")); 
        // Output: true

        // 13. replace()
        System.out.println(str.replace("Java", "World")); 
        // Output: Hello World

        // 14. trim()
        String str3 = "   Java   ";
        System.out.println(str3.trim()); 
        // Output: Java

        // 15. startsWith()
        System.out.println(str.startsWith("Hello")); 
        // Output: true

        // 16. endsWith()
        System.out.println(str.endsWith("Java")); 
        // Output: true

        // 17. isEmpty()
        String str4 = "";
        System.out.println(str4.isEmpty()); 
        // Output: true

        // 18. compareTo()
        System.out.println("Apple".compareTo("Banana")); 
        // Output: -1

        // 19. split()
        String fruits = "Apple,Banana,Mango";
        String[] arr = fruits.split(",");
        System.out.println(arr[1]); 
        // Output: Banana

        // 20. valueOf()
        int num = 100;
        String s = String.valueOf(num);
        System.out.println(s); 
        // Output: 100
    }
}
        
    

    
