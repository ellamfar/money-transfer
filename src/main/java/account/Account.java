package account;

public class Account {
    private double balance;
    private String name;

    public Account(String name) {
        this.name = name;
        balance = 0.0; //not necessary - can remove later
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(name + " has $" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance){
            balance -= amount;
            System.out.println(name + " has $" + balance);
        }
        else {
            System.out.println("Withdrawal by " + name + " failed. Not enough money in account.");
        }
    }

    public void transfer(double amount, Account acc) {
        if (this.balance < amount) {
            System.out.println("Transfer failed. Not enough money in account.");
        }
        else {
            this.balance -= amount;
            acc.balance += amount;
            System.out.println("Account of " + this.name + " now has a balance of $" + this.balance);
            System.out.println("Account of " + acc.name + " now has a balance of $" + acc.balance);
        }
    }
}
