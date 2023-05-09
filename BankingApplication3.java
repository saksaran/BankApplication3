package bankingapplication3;

import java.util.Scanner;

public class BankingApplication3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int option = 0, number;
        String name;
        double balance, amount;
        Account account;
        Bank bank = new Bank("XYZ");
        
        
        while(option != 6) {
            System.out.println("Main Menu: ");
            System.out.println("1. Display all account.");
            System.out.println("2. Open new account.");
            System.out.println("3. Close existing account.");
            System.out.println("4. Deposit.");
            System.out.println("5. Withdraw.");
            System.out.println("6. Exit.");
            System.out.println();
            System.out.print("Enter your choice: ");
            
            option = scan.nextInt();
            scan.nextLine();
            
            switch(option) {
                case 1:
                   bank.listAccount();
                   break;
                case 2:
                    number = 111111;
                    System.out.print("Enter your account name: ");
                    name = scan.nextLine();
                    System.out.print("Enter initial balance : ");
                    balance = scan.nextDouble();
                    account = new Account(number, name, balance);
                    bank.openAcocunt(account);
                    break;
                case 3:
                    System.out.print("Enter account number : ");
                    number = scan.nextInt();
                    bank.closeAccount(number);
                    break;
                case 4:
                    System.out.print("Enter account number : ");
                    number = scan.nextInt();
                    account = bank.getAccount(number);
                    System.out.print("Enter amount : ");
                    amount = scan.nextDouble();
                    bank.depositMoney(account, amount);
                    System.out.println("Balance : " + account.getBalance());
                    break;
                case 5:
                    System.out.print("Enter account number : ");
                    number = scan.nextInt();
                    account = bank.getAccount(number);
                    System.out.print("Enter amount : ");
                    amount = scan.nextDouble();
                    bank.withdrawMoney(account, amount);
                    break;
            }
        }
    }
    
    public static int generateAccountNumber() {
        Random random = new Random();
        int accNumber = 100000 + random.nextInt(900000);
        return accNumber;
    }
    
}
