package homework10.exercise2;


import java.util.ArrayList;
import java.util.List;

public class User {

    private final List<Card> cards;
    private List<BankAccount> bankAccounts;

    public User(){
            this.cards = new ArrayList<>();
    }

    public void addCard(String dateOfExpiration, String ownerName, String cardNumber){
        Card newCard=new Card(dateOfExpiration,ownerName,cardNumber);
        cards.add(newCard);
    }

    public void addBankAccount(String bankAccount,int balance){
        BankAccount newBankAccount=new BankAccount(bankAccount,balance);
        bankAccounts.add(newBankAccount);
    }

    public void listCards(){
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public void listBankAccounts(){
        for (BankAccount bankAccount : bankAccounts) {
            System.out.println(bankAccount);
        }
    }
}
