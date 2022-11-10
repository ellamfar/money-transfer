package banking;

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
        System.out.println(name + " now has a balance of $" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance){
            balance -= amount;
            System.out.println(name + " now has a balance of $" + balance);
        }
        else {
            System.out.println("Withdrawal failed. Insufficient funds.");
        }
    }

    public void transfer(double amount, Account acc) {
        if (this.balance < amount) {
            System.out.println("Transfer failed. Insufficient funds.");
        }
        else {
            this.balance -= amount;
            acc.balance += amount;
            System.out.println("Funds successfully transfered.");
            System.out.println(this.name + " now has a balance of $" + this.balance);
            System.out.println(acc.name + " now has a balance of $" + acc.balance);
        }
    }
}
