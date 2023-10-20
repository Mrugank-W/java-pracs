public class bank {
    public static void main(String[] args) {
        // Creating a bank account
        BankAccount account = new BankAccount();
        
        // Creating deposit and withdraw threads
        Thread depositThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                account.deposit(100);
            }
        });
        
        Thread withdrawThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                account.withdraw(50);
            }
        });
        
        // Starting the threads
        depositThread.start();
        withdrawThread.start();
    }
}

class BankAccount {
    private int balance = 0;
    
    public synchronized void deposit(int amount) {
        System.out.println("Depositing " + amount);
        balance += amount;
        System.out.println("New balance: " + balance);
    }
    
    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println("Withdrawing " + amount);
            balance -= amount;
            System.out.println("New balance: " + balance);
        } else {
            System.out.println("Insufficient funds");
        }
    }
}