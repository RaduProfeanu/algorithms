package homework10.exercise2;

public class TestClass {
    public static void main(String[] args) {
        User utilizator=new User();
        utilizator.addCard("20220912","Radu Profeanu","121111111111111111111111111111111111111111111111");
        utilizator.addCard("20200111","Ion Ion","136");

      //  utilizator.addBankAccount("RO39INGB000000000000000000");

        utilizator.listCards();
       // utilizator.listBankAccounts();

        BankAccount testbankaccount= new BankAccount("ROINGB000000",400);
        testbankaccount.addMoney(200);
        testbankaccount.withdrawMoney(300);

    }
}
