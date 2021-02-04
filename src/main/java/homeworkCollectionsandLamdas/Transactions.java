package homeworkCollectionsandLamdas;

//import lombok.ToString;

import lombok.ToString;

@ToString
public class Transactions {
    private Trader trader;
    private int value;
    private int year;

    public Transactions(Trader trader,int year,int value){
        this.trader=trader;
        this.year=year;
        this.value=value;
    }

    public void setTrader(Trader trader) {
        this.trader = trader;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getValue() {
        return value;
    }

    public int getYear() {
        return year;
    }
}
