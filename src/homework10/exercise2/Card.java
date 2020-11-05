package homework10.exercise2;

public class Card {

    private String dateOfExpiration;
    private String ownerName;
    private String cardNumber;

    public Card(String dateOfExpiration, String ownerName, String cardNumber) {
        this.dateOfExpiration = dateOfExpiration;
        this.ownerName = ownerName;
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber)  {

        if(16 != cardNumber.length()){
            throw new StringIndexOutOfBoundsException("This is not a valid card number");
        }else {

            this.cardNumber = cardNumber;
        }
    }


    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getDateOfExpiration() {
        return dateOfExpiration;
    }

    public void setDateOfExpiration(String dateOfExpiration) {
        this.dateOfExpiration = dateOfExpiration;
    }

    @Override
    public String toString() {
        return "Card{" +
                "dateOfExpiration='" + dateOfExpiration + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", cardNumber=" + cardNumber +
                '}';
    }
}
