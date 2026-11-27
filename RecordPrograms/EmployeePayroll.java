import java.util.Scanner;

interface Payroll {
    void displaySalary();
}

class RegularEmployee implements Payroll {
    int basic = 25000;
    int hra = 15000;
    int ta = 5000;

    public void displaySalary() {
        System.out.println("Salary Details:");
        System.out.println("Basic Pay: " + basic
                + " HRA: " + hra
                + " T.A: " + ta
                + " Total Amount: " + (basic + hra + ta));
    }
}

class ContractEmployee implements Payroll {
    int basic = 12000;
    int hra = 0;
    int ta = 3000;

    public void displaySalary() {
        System.out.println("Salary Details:");
        System.out.println("Basic Pay: " + basic
                + " HRA: " + hra
                + " T.A: " + ta
                + " Total Amount: " + (basic + hra + ta));
    }
}

public class EmployeePayroll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Id: ");
        String id = sc.nextLine().trim().toUpperCase();

        Payroll employee;

        if (id.startsWith("R")) {
            employee = new RegularEmployee();
        } else if (id.startsWith("C")) {
            employee = new ContractEmployee();
        } else {
            System.out.println("Invalid Employee Id");
            sc.close();
            return;
        }

        employee.displaySalary();

        sc.close();
    }
}
