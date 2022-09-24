public class Main {
    public static void main(String[] args) {
        System.out.println("Chase Bank");
        BankAccount account = new BankAccount();

        account.setAccountId(1234);
        System.out.println("Your Account Id is " + account.getAccountId());

        account.setAccountHolder("Tewabe");
        System.out.println("Your Account Name is " + account.getAccountHolder());

        account.setAccountValue(99.99);
        System.out.println("Your Account Value is " + account.getAccountValue());

        account.deposit(199.99);
        System.out.println("Your Account Value is " + account.getAccountValue());

        account.withdraw(9.99);
        System.out.println("Your Account Value is " + account.getAccountValue());
    }
}
