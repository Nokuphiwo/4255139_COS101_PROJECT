package sprint3;

import java.util.Scanner;


public class _4255139BankAccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();

        _4255139BankAccountClass account = new _4255139BankAccountClass(name, surname,accountNumber);
        System.out.println();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter the number of the transaction you want to do: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Balance: R" + account.getBalance());
                    break;
                case 4:
                    scanner.close();
                    return;
                default:
                    System.out.println("You entered an invalid number. Please try again and enter another number.");
            }
        }
    }
}
