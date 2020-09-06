package homework4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Homework4 {

    static boolean isDivisible(int number, int divizor) {
        boolean divisibil = false;
        if (number % divizor == 0) {
            divisibil = true;
        }
        return divisibil;
    }

    static int rangeSum(int start,int end, int divizor){
        int sum=0;

        if(start>end){
            return -1;
        }else{
            for(int i=start;i<=end;i++){
                if (isDivisible(i,divizor)){
                    sum=sum+i;
                }
            }
        }
        return sum;
    }

    // metoda rangeSum utilizand array

    static int rangeSumArray(int[] array,int divizor){

        int[] a = new int[]{4,5,12,7,8,9,10,11,7};
        Arrays.sort(a);
        int sum1=0;

        for(int i=0;i<=a.length-1;i++){
            if (isDivisible(i,divizor)) {
                sum1 = sum1+ i;
            }
        }
        return sum1;
    }

    //metoda de convertire in string

    static String convertFromSeconds(int sec) {
        int seconds = sec % 60;
        int minutes = sec / 60;
        if (minutes >= 60) {
            int hours = minutes / 60;
            minutes %= 60;
            if( hours >= 24) {
                int days = hours / 24;
                return String.format("%d days %02d:%02d:%02d", days,hours%24, minutes, seconds);
            }
            return String.format("%02d:%02d:%02d", hours, minutes, seconds);
        }
        return String.format("00:%02d:%02d", minutes, seconds);
    }

    //metoda de impachetare

    static boolean canPack(int bigCount,int smallCount,int goal){
        boolean impachetare=false;

        if(bigCount<0||smallCount<0||goal<0){
            return impachetare;
        }else{
            if(goal<=5*bigCount+smallCount){
                impachetare=true;
                return impachetare;
            }
        }
        return impachetare;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti primul numar ");

        int primulNumar = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Introduceti al doilea numar ");

        int alDoileaNumar = scanner2.nextInt();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Introduceti divizorul");

       int divider=scanner3.nextInt();

        System.out.println("Suma este: "+rangeSum(primulNumar,alDoileaNumar,divider));

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Introduceti dimensiunea array-ului:");
        int size = scanner4.nextInt();
        int[] myArray = new int[size];
        System.out.println("Introduceti elementele array-ului:");

        for(int i=0; i<size; i++) {
            myArray[i] = scanner4.nextInt();
        }

        System.out.println("Suma este: "+rangeSumArray(myArray,divider));

        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Introduceti nr de secunde");

        int nrSecunde=scanner5.nextInt();

        System.out.println("Secundele convertite echivaleaza "+convertFromSeconds(nrSecunde));

        Scanner scanner6 = new Scanner(System.in);
        System.out.println("Introduceti nr. pachetelor mari ");
        int nrPacheteMari = scanner6.nextInt();

        Scanner scanner7 = new Scanner(System.in);
        System.out.println("Introduceti numarul de pachete mici ");

        int nrPacheteMici = scanner7.nextInt();

        Scanner scanner8 = new Scanner(System.in);
        System.out.println("Introduceti obiectivul");

        int obiectiv=scanner8.nextInt();
        System.out.println("Se pot impacheta? "+canPack(nrPacheteMari,nrPacheteMici,obiectiv));

    }
}
