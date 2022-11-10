package banking;

public class Driver {
    
    public static void main(String[] args) {
        Account tom = new Account("Tom");
        tom.deposit(500.0);
        Account sandy = new Account("Sandy");
        sandy.deposit(200.0);
        tom.transfer(100.0, sandy);
        sandy.withdraw(50.0);
        sandy.withdraw(600.0);
        System.out.println("$" + sandy.getBalance());
    }
}
