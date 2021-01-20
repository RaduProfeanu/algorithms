package homeworkCollectionsandLamdas;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LondonStockMarket {

    static Trader raoul = new Trader("Raoul", "Cambridge");

    static Trader mario = new Trader("Mario", "Milan");

    static Trader alan = new Trader("Alan", "Cambridge");

    static Trader brian = new Trader("Brian", "Cambridge");

    static List<Transactions> transactions = List.of(
            new Transactions(brian, 2011, 300),
            new Transactions(raoul, 2012, 1000),
            new Transactions(raoul, 2011, 400),
            new Transactions(mario, 2012, 710),
            new Transactions(mario, 2012, 700),
            new Transactions(alan, 2012, 950));

    /**
     * 1. Find all transactions in the year 2011 and sort them by value (small to high).
     * 2. What are all the unique cities where the traders work?
     * 3. Find all traders from Cambridge and sort them by name.
     * 4. Return a string of all traders’ names sorted alphabetically.
     * 5. Are any traders based in Milan?
     * 6. Print all transactions’ values from the traders living in Cambridge.
     * 7. What’s the highest value of all the transactions?
     * 8. Find the transaction with the smallest value.
     */
    public static void main(String[] args) {
        //1
        transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011) // boolean test(Transaction t);
                .sorted((t1, t2) -> t1.getValue() - t2.getValue())
                .forEach(System.out::println);

        //2
        transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011); // boolean test(Transaction t);

        Set<String> names = transactions.stream()
                .map(tr -> tr.getTrader().getCity())
                .collect(Collectors.toSet());
        System.out.println("stringSet = " + names);

        //6 Print all transactions’ values from the traders living in Cambridge.
        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .peek(System.out::print)

                .map(Transactions::getValue)
                .forEach(System.out::println);
        //3
        System.out.println("3. Find all traders from Cambridge and sort them by name.");
        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .sorted(Comparator.comparing((Transactions t1) -> t1.getTrader().getName()))
                .map(Transactions::getTrader)
                .distinct()
                .forEach(System.out::println);
        //4
        System.out.println("4. Return a string of all traders’ names sorted alphabetically.");
        transactions.stream()
                .sorted(Comparator.comparing((Transactions t1) -> t1.getTrader().getName()))
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .forEach(x -> System.out.print(x + " "));
        //5
        System.out.println();
        System.out.println("5. Are any traders based in Milan?");

        //6 Print all transactions’ values from the traders living in Cambridge.
        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .peek(System.out::print)
                .map(Transactions::getValue)
                .forEach(System.out::println);

       // boolean basedInMilan = transactions.stream()
        //        .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
        if (transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"))) {
            System.out.println("Yes");

        } else System.out.println("No");


    }
}