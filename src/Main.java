public class Main {
    public static void main(String[] args) {
        System.out.println("Chase Bank");
        BankAccount account = new BankAccount();

        account.setAccountId(1234);
        System.out.println("Your Account Id is " + account.getAccountId());

        account.setAccountHolder("Tewabe");
        System.out.println("Your Account Name is " + account.getAccountHolder());
    }
}
