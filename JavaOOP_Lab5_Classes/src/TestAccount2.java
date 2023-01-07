public class TestAccount2 {
    public static void main(String[] args) {
        Customer2 customer1 = new Customer2(1001, "Tan Ah Teck", 'm');
        System.out.print(customer1);
        Account2 account1 = new Account2(2001, customer1, 1000.00);
        System.out.print(account1);

        account1.deposit(500.00);
        System.out.print(account1);

        account1.withdraw(700.00);
        System.out.print(account1);

        account1.withdraw(1000.00);
        System.out.print(account1);
    }
}