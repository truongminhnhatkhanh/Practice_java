package bai1;
public class Account {
    // Attributes
    private String id;
    private String name;
    private int balance = 0;

    // Constructors
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Getter methods
    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    // Credit method
    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    // Debit method
    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // Transfer method
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            this.debit(amount);  // Calling debit() method
            another.credit(amount);  // Transfer the amount to another account
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // toString method
    @Override
    public String toString() {
        return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
}
