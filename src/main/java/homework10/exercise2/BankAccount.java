package homework10.exercise2;

import java.util.List;

public class BankAccount {

    private String bankAccount;
    private int balance;
    private List<Card> attachedCardNumber;


    public BankAccount(String bankAccount, int balance) {
        this.bankAccount = bankAccount;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void addMoney(int amount){

        if(amount<=0){
            this.balance=0;
        }else{
            this.balance=balance+amount;
        }
        System.out.println("Money in the account "+balance);
    }

    public void withdrawMoney(int amount){

        if (balance<=0||amount>=balance){
            throw new ArithmeticException("Please deposit money before withdrawl");
        }else{
            this.balance=balance-amount;
        }
        System.out.println("Money in the account "+balance);
    }

    public void attachCard(String cardNumber){

        String newattachedCard=new String();
      //  attachedCardNumber.add(newattachedCard);

    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "bankAccount='" + bankAccount + '\'' +
                ", balance=" + balance +
                '}';
    }
}
