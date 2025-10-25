public class Accounts {
    public static void main (String[] args) {
        
    }
}

class Account {
    private String id;
    private String password;
    private double balance;

    Account (String id, String password) {
        this.id = id;
        this.password = password;
    }

    double getBalance (String id, String password) {
        if (this.id.equals(id) && this.password.equals(password)) {
            return this.balance;
        }
        System.out.println("Account ID and Password don't match!");
        return 0.0;
    }
    
    void setBalance (double transaction) {
        this.balance += transaction;
    }
}