import number.Roman;

public class RomanDemo {

    public static void main(String[] args) {

        String roman = "LVIII";

        int result = Roman.romanToInteger(roman);

        System.out.println("Roman: " + roman);
        System.out.println("Integer: " + result);
    }
}
