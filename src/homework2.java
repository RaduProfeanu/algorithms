import java.util.Scanner;

public class homework2 {

// functia de mai jos verifica daca un numar este prim
    static boolean isPrime(int n) {

        if(n<1) {
        return false;
        }else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }

        }
    return true;
    }

    // functia de mai jos sorteaza un array

    static int[] sortArray(int[] n){
        int num[] = new int[]{1,4,-56,2,23,14};

        for (int i=0;i<num.length;i++){
           for (int j=i+1;j<num.length;j++){
               if(num[i]>num[j]){
                  int temp=num[i];
                   num[i]=num[j];
                   num[j]=num[i];
                   System.out.println(num[i]+" ");
               }
           }
        }
        return;
    }

    public static void main(String[] args) {


        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9,};



        for (int j = 0; j < 10; j++) {
            for (int i = 0; i <= array.length - 1; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.print("\n");
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i==j) {
                    System.out.print(1+" ");
                } else {
                    System.out.print(0+" ");
                }

            }
            System.out.print("\n");
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i+1==j) {
                    System.out.print(1+" ");
                } else {
                    System.out.print(0+" ");
                }

            }
            System.out.print("\n");
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <10; j++) {
                if (i==9-j) {
                    System.out.print(1+" ");
                } else {
                    System.out.print(0+" ");
                }

            }
            System.out.print("\n");
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(i);

            }
            System.out.print("\n");
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(i);

            }
            System.out.print("\n");
        }

        int randuri=6;
        for (int i = randuri-1; i >=0; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print(randuri-i);

            }
            System.out.print("\n");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar n:");
        int numarPrim=scanner.nextInt();
        int[] arrayPrime=new int[numarPrim];

        for(int i=2;i<=numarPrim-1;i++) {

            if(isPrime(i)) {

                arrayPrime[i]=i;
                System.out.print(arrayPrime[i] + " ");
            }
        }

        int[] arrayDeSortat = new int[]{20,3,23,1,-56,0, 42};
        System.out.println(sortArray(arrayDeSortat));
        }
    }
