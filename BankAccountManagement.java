class Account {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    // Constructor
    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter of balance
    public double getBalance() {
        return balance;
    }

    // Setter of balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance! Cannot be negative.");
        }
    }

    // Display bank account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: Rs" + balance);
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(String accountNumber,String accountHolder, double balance) {
        super(accountNumber,accountHolder,balance);
    }

    // Display savings account
    public void displaySavingsAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: Rs" + getBalance());
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        Account acc1 = new Account("123456789", "Loveleen Goyal", 1500.75);
        acc1.displayAccountDetails();

        // Modifying balance using setter
        acc1.setBalance(2800.50);
        System.out.println("Updated Balance: Rs" + acc1.getBalance());

        System.out.println("------------------------");

        // Creating a savings account
        SavingsAccount savingsAcc = new SavingsAccount("987654321", "Yagyata Sharma", 3000.00);
        System.out.println("Savings Account Details: ");
        savingsAcc.displaySavingsAccount();
    }
}

/*
Account Number: 123456789
Account Holder: Loveleen Goyal
Balance: Rs1500.75
Updated Balance: Rs2800.5
------------------------
Savings Account Details:
Account Number: 987654321
Account Holder: Yagyata Sharma
Balance: Rs3000.0
*/
