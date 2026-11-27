import java.util.Scanner;

class LengthNotSufficientException extends Exception {

    LengthNotSufficientException(String message) {
        super(message);
    }
}

public class MobileNumberCheck {

    static void validate(String number)
            throws LengthNotSufficientException {

        for (int i = 0; i < number.length(); i++) {

            if (!Character.isDigit(number.charAt(i))) {
                throw new NumberFormatException();
            }
        }

        if (number.length() > 10) {
            throw new ArrayIndexOutOfBoundsException();
        }

        if (number.length() < 10) {
            throw new LengthNotSufficientException(
                    "Length is less than 10");
        }

        System.out.println("Valid number");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mobile number: ");
        String number = sc.nextLine();

        try {
            validate(number);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(
                "Invalid Mobile Number-ArrayIndexOutOfBounds Exception");

        } catch (LengthNotSufficientException e) {

            System.out.println(
                "Invalid Mobile Number – LengthNotSufficientException");

        } catch (NumberFormatException e) {

            System.out.println(
                "Invalid Mobile Number – NumberFormatException");
        }

        sc.close();
    }
}
