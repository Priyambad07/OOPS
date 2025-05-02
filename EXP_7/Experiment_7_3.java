
interface Wallet {
    void addFunds(double amount);
    void spendFunds(double amount);
}
class DigitalWallet implements Wallet {
    private double balance;

    public DigitalWallet() {
        this.balance = 0.0;
    }


    public void addFunds(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Added Rs." + amount + " to the wallet.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void spendFunds(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Spent $" + amount + " from the wallet.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Invalid spending amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Current balance: Rs." + balance);
    }
}

public class Experiment_7_3 {
    public static void main(String[] args) {
        DigitalWallet myWallet = new DigitalWallet();
        
        myWallet.addFunds(100.0); 
        myWallet.displayBalance();
        
        myWallet.spendFunds(30.0);
        myWallet.displayBalance();
        
        myWallet.spendFunds(80.0); 
        myWallet.displayBalance();

        myWallet.addFunds(50.0); 
        myWallet.displayBalance();
    }
}
