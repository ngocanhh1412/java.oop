public class Account2 {
    private int id;
    private Customer2 customer;
    private double balance = 0.00;

    public Account2(int id, Customer2 customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account2(int id, Customer2 customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getID() {
        return id;
    }

    public Customer2 getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        String name = customer.getName();
        return name + "(" + customer.getID() + ")" + " balance=$" + balance + "0";
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public Account2 deposit(double amount) {
        balance += amount;
        return this;
    }

    public Account2 withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("amount withdraw exceeds the current balance!");
        }
        return this;
    }
}
