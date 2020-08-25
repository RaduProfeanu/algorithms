import java.util.Scanner;

public class homework2WhileEx4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar:");
        int numarCititDeLaTastura = scanner.nextInt();

        int sumaNumerelorCitite=0;
        while(numarCititDeLaTastura!=0){
            sumaNumerelorCitite = numarCititDeLaTastura + sumaNumerelorCitite;
            System.out.println("Suma este "+sumaNumerelorCitite);
            scanner = new Scanner(System.in);
            System.out.println("Introduceti un numar:");
            numarCititDeLaTastura = scanner.nextInt();
        }
    }
}
