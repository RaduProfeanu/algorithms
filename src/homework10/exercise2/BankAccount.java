package homework10.exercise2;

import java.util.List;

public class BankAccount {

    private String iban;

    private int balance;

    private List<Card> attachedCardNumber;

    public BankAccount(String iban, int balance) {
        this.iban = iban;
        //validare
        this.balance = balance;
    }

    public void addMoney(int amount) {

        if (amount <= 0) {
            balance = 0;
        } else {
            balance = balance + amount;
        }
        System.out.println("Money in the account " + balance);
    }

    public void withdrawMoney(int amount) {

        if (amount >= balance) {
            throw new NotEnoughBalanceException("Please deposit money before withdrawl");
        } else {
            balance = balance - amount;
        }
        System.out.println("Money in the account " + balance);
    }

    public void attachCard(Card card) {
        attachedCardNumber.add(card);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "bankAccount='" + iban + '\'' +
                ", balance=" + balance +
                '}';
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
}
