interface PaymentService {
    void pay(String upiId, double amount)
        throws InvalidUPIException, InvalidAmountException,
               InsufficientBalanceException;
    double checkBalance();
}
class InvalidUPIException extends Exception {
    public InvalidUPIException(String message) {
        super(message);
    }
}
class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
class Wallet {
    private String userName;
    private String mobileNumber;
    private String upiId;
    private double balance;
    public Wallet(String userName, String mobileNumber,
                  String upiId, double balance) {
        this.userName = userName;
        this.mobileNumber = mobileNumber;
    }
        this.upiId = upiId;
        this.balance = balance;
    public void addMoney(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException(
                "Amount must be greater than zero.");
        }
        balance += amount;
        System.out.println("Money added: Rs." + amount);
    }
    public double getBalance() {
        return balance;
    }
    public void deductMoney(double amount) {
        balance -= amount;
    }
    public void displayWalletDetails() {
        System.out.println("User Name     : " + userName);
        System.out.println("Mobile Number  : " + mobileNumber);
        System.out.println("UPI ID         : " + upiId);
        System.out.printf("Balance        : Rs.%.2f%n", balance);
    }
}
class UPIPayment implements PaymentService {
    private Wallet wallet;
    public UPIPayment(Wallet wallet) {
        this.wallet = wallet;
    }
    @Override
    public void pay(String upiId, double amount)
            throws InvalidUPIException, InvalidAmountException,
                   InsufficientBalanceException {
        if (upiId == null || !upiId.contains("@")) {
            throw new InvalidUPIException("Invalid UPI ID.");
        }
        if (amount <= 0) {
            throw new InvalidAmountException(
                "Payment amount must be greater than zero.");
        }
        if (amount > wallet.getBalance()) {
            throw new InsufficientBalanceException(
                "Insufficient wallet balance.");
        }
        wallet.deductMoney(amount);
        System.out.println("Payment successful to " + upiId);
        System.out.println("Amount paid: Rs." + amount);
    }
    @Override
    public double checkBalance() {
        return wallet.getBalance();
    }
}
public class UPIWalletDemo {
    public static void main(String[] args) {
        Wallet wallet = new Wallet(
            "Ananya", "9876543210", "ananya@upi", 5000);
        UPIPayment payment = new UPIPayment(wallet);
        System.out.println("===== WALLET DETAILS =====");
        wallet.displayWalletDetails();
        try {
            System.out.println("\nAdding Rs.2000...");
            wallet.addMoney(2000);
            System.out.println("\nMaking UPI payment...");
            payment.pay("rahul@upi", 2500);
        } catch (InvalidUPIException |
                 InvalidAmountException |
                 InsufficientBalanceException e) {
            System.out.println("Transaction failed: "
                    + e.getMessage());
        } finally {
    }
        }
            System.out.println("\n===== FINAL WALLET DETAILS =====");
            wallet.displayWalletDetails();
            System.out.printf("Available Balance: Rs.%.2f%n",
                    payment.checkBalance())
}
}
}
