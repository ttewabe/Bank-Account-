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


}
