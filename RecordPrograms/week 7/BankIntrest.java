import java.util.Scanner;

class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }

    void displayCustomer() {
        System.out.println("Customer: " + name);
    }
}

class Account {
    String accountNumber;
    double balance;

    Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayAccount() {
        System.out.println("Account: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class RBI {
    double getRateOfInterest() {
        return 4.0;
    }
}

class SBI extends RBI {
    @Override
    double getRateOfInterest() {
        return 7.0;
    }
}

class ICICI extends RBI {
    @Override
    double getRateOfInterest() {
        return 6.5;
    }
}

class PNB extends RBI {
    @Override
    double getRateOfInterest() {
        return 6.0;
    }
}

public class BankInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Bank name to find the rate of Interest : ");
        String bank = sc.nextLine().trim().toUpperCase();

        RBI ref;

        switch (bank) {
            case "SBI":
                ref = new SBI();
                break;
            case "ICICI":
                ref = new ICICI();
                break;
            case "PNB":
                ref = new PNB();
                break;
            case "RBI":
                ref = new RBI();
                break;
            default:
                System.out.println("Invalid bank name.");
                sc.close();
                return;
        }

        System.out.println("RBI rate of interest is : "
                + ref.getRateOfInterest() + "%");

        sc.close();
    }
}
