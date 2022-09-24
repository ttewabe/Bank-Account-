public class BankAccount {
    int accountId;
    String accountHolder;
    double accountValue;
    public int getAccountId(){
        return accountId;
    }

    public void setAccountId(int idInput ){
        accountId = idInput;
    }
    // Retrieve account Holder
    public String getAccountHolder(){
       return accountHolder;
    }
    // change account holder
    public void setAccountHolder(String name ){
        accountHolder = name;
    }
    public double getAccountValue(){
        return accountValue;
    }
    // change account Value
    public void setAccountValue(double ValueInput ){
        accountValue = ValueInput;
    }
    // add funds to account
    public void deposit(double amount){
        System.out.println("Depositing: $ " + amount);
        accountValue += amount;
        System.out.println("Account value is now: " + getAccountValue());
    }
// remove funds from account
    public void withdraw(double amount){
        System.out.println("Withdrawing: $ " + amount);
        accountValue -= amount;
        System.out.println("Account value is now: " + getAccountValue());
    }

}
