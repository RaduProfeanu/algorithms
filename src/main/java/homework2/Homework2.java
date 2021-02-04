package homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Homework2 {

    // functia de mai jos verifica daca un numar este prim
    public static void main(String[] args) {

        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9,};
        sortArray(array);


        for (int j = 0; j < 10; j++) {
            for (int i = 0; i <= array.length - 1; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.print("\n");
        }

        print1OnMainDiagonal();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i + 1 == j) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }

            }
            System.out.print("\n");
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 9 - j) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }

            }
            System.out.print("\n");
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i);

            }
            System.out.print("\n");
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i);
                System.out.print("\n");
            }
        }

        int randuri = 6;
        for (int i = randuri - 1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(randuri - i);

            }
            System.out.print("\n");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar n:");
        int numarPrim = scanner.nextInt();
        int[] arrayPrime = new int[numarPrim];

        for (int i = 2; i <= numarPrim - 1; i++) {

            if (isPrime(i)) {

                arrayPrime[i] = i;
                System.out.println(arrayPrime[i] + " ");
            }
        }

        int[] arrayDeSortat = new int[]{20, 3, 23, 1, -56, 0, 42};
        sortArray(arrayDeSortat);
        //
        int p = 6;
        boolean condition = false;
        int nrDeIncercari = 0;

        while (!condition) {

            scanner = new Scanner(System.in);
            System.out.println("Introduceti un numar:");
            int numarCititDeLaTastura = scanner.nextInt();
            if (numarCititDeLaTastura < p) {
                System.out.println("numarul este mai mic");
                nrDeIncercari++;
            } else if (numarCititDeLaTastura > p) {
                System.out.println("numarul este mai mare");
                nrDeIncercari++;
            } else if (numarCititDeLaTastura == p) {
                System.out.println("Felicitari!Ai ghicit numarul");
                condition = true;
                nrDeIncercari++;

            }
            System.out.println("nr de incercari a fost " + nrDeIncercari);
        }
    }

    static boolean isPrime(int n) {

        if (n < 1) {
            return false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }

        }
        return true;
    }

    // functia de mai jos sorteaza un array

    private static void sortArray(int[] n) {

        int[] num = new int[]{1, 4, -56, 2, 23, 14};


        int[] sortedArray = new int[num.length];

        for (int i = 0; i < num.length; i++) {
            int min = Integer.MAX_VALUE;
            int index = 0;
            for (int j = 0; j < num.length; j++) {
                if (num[j] < min) {
                    min = num[j];
                    index = j;
                }
            }
            sortedArray[i] = min;
            num[index] = Integer.MAX_VALUE;
        }
        System.out.println("sortedArray=" + Arrays.toString(sortedArray));
    }

    private static void print1OnMainDiagonal() {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }

            }
            System.out.print("\n");
        }
    }
}




