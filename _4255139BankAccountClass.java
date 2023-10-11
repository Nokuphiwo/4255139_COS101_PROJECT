package sprint3;


public class _4255139BankAccountClass{

    private int accountNumber;
    private String accountHolder;
    private double balance;

    public _4255139BankAccountClass(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0; 
    }
    
    
    
    public _4255139BankAccountClass(String name, String surname,int accountNumber) {
		// TODO Auto-generated constructor stub
	}
	public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: R" + amount + " Succesfully" );
        } else {
            System.out.println("Invalid deposit amount Intered, Please try again.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Your Succesfully Withdrawn an amount of: R" + amount );
            return true; 
        } else {
            System.out.println("Invalid withdrawal amount, Inter an amount same or less than your balance");
            return false; 
        }
    }
}
