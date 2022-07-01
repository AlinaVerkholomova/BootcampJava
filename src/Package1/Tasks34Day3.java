package Package1;

public class Tasks34Day3 {

    public static void main(String[] args) {

        BankAccount myBankAccount = new BankAccount(900);
        BankAccount newBankAccount = new BankAccount(800);

        myBankAccount.moneyTransfer(myBankAccount, newBankAccount, 1000);
        newBankAccount.printBalance();
        myBankAccount.printBalance();

        myBankAccount.deposit(7000);
        myBankAccount.printBalance();
        myBankAccount.withdraw(750);
        myBankAccount.printBalance();
        myBankAccount.withdraw(200);

    }
}

class BankAccount {

    private double balance;

    public BankAccount(){

    }

    public BankAccount(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double deposit(double amount) {
        if (amount <= 5000)
            return balance += amount;
        else {
            System.out.printf("" +
                    "Transaction canceled. Max deposit - 5000 | " +
                    "Your deposit: %.2f%n", balance);
            return 0;
        }
    }

    public double withdraw(double amount) {
        if (balance >= amount)
            return balance -= amount;
        else {
            System.out.println("There is not enough funds");
            return 0;
        }
    }

    public void printBalance(){
        System.out.println("Current balance is: " + balance);
    }

    public void moneyTransfer(BankAccount bankAccount1, BankAccount bankAccount2, double amount) {
        if (bankAccount1.balance > 0 && bankAccount1.balance >= amount) {
            bankAccount2.balance += amount;
            bankAccount1.balance -= amount;
            System.out.printf("%.2f amount has been sent to another account %n", amount);
        }
        else
            System.out.printf("" +
                    "Transfer canceled. You are trying to transfer %.2f units, " +
                    "but only %.2f are available.%n", amount, bankAccount1.balance);
    }

}
