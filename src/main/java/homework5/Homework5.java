package homework5;

import java.util.Scanner;

public class Homework5 {


    static boolean isDivisible(int number, int divizor) {
        boolean divisibil = false;
        if (number % divizor == 0) {
            divisibil = true;
        }
        return divisibil;
    }

    //exercise 4 homework 5 - refactor ex. 1 homework 4

    static int rangeSum(int start,int end, int divizor){
        int sum=0;
        int contor=start;

        if(start>end){
            return -1;
        }else{
            while(contor>=start && contor<=end){
                if (isDivisible(contor,divizor)){
                    sum=sum+contor;
                }
                contor++;
            }
        }
        return sum;
    }

    // exercise 2 homework 5

    static void noCount(){
        String answer="";
        int nrZerouri=0;
        int nrPozitive=0;
        int nrNegative=0;

        do{
            Scanner scan=new Scanner(System.in);
            System.out.println("Introduceti numar");
            int num=scan.nextInt();

            if(num>0){
                nrPozitive++;
            }

            if (num < 0) {
                nrNegative++;
            }
            if(num==0){
                nrZerouri++;
            }
            System.out.println("do you want to continue?");
            answer=scan.next();
        }while(answer.equals("y"));

        System.out.println("nr elementelor pozitive este "+ nrPozitive);
        System.out.println("nr elementelor negative este "+ nrNegative);
        System.out.println("nr elementelor egale cu zero "+ nrZerouri);
    }

    // exercise 3 homework 5

    static int calcFactorial(int n){
       int factorial=1;
       if (n==0){
           return 1;
       }else{
           for (int i=1;i<=n;i++){
           factorial=factorial*i;
       }
       }
       return factorial;
    }

    static double calcSin(double x, int n){

        double radiants=Math.toRadians(x);
        int power=1;
        double sinx=0.0;
        for(int i=1;i<=n;i++){
            double temp=0.0;
            if(i%2==0){
                temp=-Math.pow(radiants,power)/calcFactorial(power);
            }else{
                temp=Math.pow(radiants,power)/calcFactorial(power);
            }
            sinx=sinx+temp;
            power=power+2;
        }
        return sinx;

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
        noCount();

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Introduceti valoarea x ");

        double radiants = scanner.nextDouble();

        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Introduceti numarul folosit la aproximare ");

        int aproximare = scanner.nextInt();

        System.out.println("valoarea sin x este: "+calcSin(radiants,aproximare));

    }
}
