package Package1;

public class Tasks34Day3 {

    public static void main(String[] args) {

        BankAccount myBankAccount = new BankAccount(900);
        BankAccount newBankAccount = new BankAccount(800);

        myBankAccount.moneyTransfer(newBankAccount, 1000);
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

    public void deposit(double amount) {
        if (amount <= 5000)
            balance += amount;
        else
            System.out.printf("" +
                    "Transaction canceled. Max deposit - 5000 | " +
                    "Your deposit: %.2f%n", balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
        else {
            System.out.println("There is not enough funds");
        }
    }

    public void printBalance(){
        System.out.println("Current balance is: " + balance);
    }

    public void moneyTransfer(BankAccount bankAccount, double amount) {
        if (this.balance > 0 && this.balance >= amount) {
            bankAccount.balance += amount;
            this.balance -= amount;
            System.out.printf("%.2f amount has been sent to another account %n", amount);
        }
        else
            System.out.printf("" +
                    "Transfer canceled. You are trying to transfer %.2f units, " +
                    "but only %.2f are available.%n", amount, this.balance);
    }

}
