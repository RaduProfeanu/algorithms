package homework2;

import java.util.Scanner;

public class homework2WhileEx7 {
    public static void main(String[] args) {

        int p=1111;
        boolean condition = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un pinul:");
        int numarCititDeLaTastura = scanner.nextInt();

        while (!condition) {

            if (numarCititDeLaTastura != p) {
                System.out.println("Pin incorect");
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Introduceti un pinul:");
                int numarCititDeLaTastura2 = scanner.nextInt();
                if (numarCititDeLaTastura2!= p){
                    System.out.println("Pin incorect");
                    Scanner scanner3 = new Scanner(System.in);
                    System.out.println("Introduceti un pinul:");
                    int numarCititDeLaTastura3 = scanner.nextInt();
                    if (numarCititDeLaTastura3 != p) {
                        System.out.println("card blocat");
                        condition = true;
                    }
                }
            } else if (numarCititDeLaTastura==p) {
                System.out.println("Pin acceptat");
                condition = true;

            }

        }
    }
}
