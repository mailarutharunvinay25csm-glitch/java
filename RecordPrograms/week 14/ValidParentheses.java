import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ValidParentheses {

    static boolean matches(char open, char close) {

        return (open == '(' && close == ')')
            || (open == '{' && close == '}')
            || (open == '[' && close == ']');
    }

    static boolean isValid(String s) {

        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {

                stack.push(ch);

            } else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty()
                        || !matches(stack.pop(), ch)) {

                    return false;
                }

            } else {

                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter bracket string: ");

        String input = sc.nextLine();

        if (isValid(input)) {

            System.out.println("Valid");

        } else {

            System.out.println("Not valid");
        }

        sc.close();
    }
}
