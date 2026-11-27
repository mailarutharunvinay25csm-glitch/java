import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneCombinations {

    static final String[] MAP = {
        "", "", "abc", "def", "ghi", "jkl",
        "mno", "pqrs", "tuv", "wxyz"
    };

    static List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

        if (digits == null || digits.isEmpty()) {
            return result;
        }

        result.add("");

        for (char digit : digits.toCharArray()) {

            if (digit < '2' || digit > '9') {
                throw new IllegalArgumentException(
                        "Digits must be from 2 to 9");
            }

            List<String> next = new ArrayList<>();

            String letters = MAP[digit - '0'];

            for (String prefix : result) {

                for (char letter : letters.toCharArray()) {

                    next.add(prefix + letter);
                }
            }

            result = next;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter digits (2-9): ");

        String digits = sc.nextLine().trim();

        try {

            System.out.println(letterCombinations(digits));

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
