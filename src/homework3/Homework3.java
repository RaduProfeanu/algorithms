package homework3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Homework3 {

    //metoda pentru convertirea in km a milelor

    static double convertToKilometersPerHour(double milesPerHour) {
        if (milesPerHour >= 0) {
            milesPerHour = milesPerHour * 1.609344;

        } else {
            System.out.println("input invalid");
        }
        return milesPerHour;
    }

    //metoda de verificat daca cainele latra

    static boolean shouldWakeUp(boolean barking, int hour) {

        if (barking && (hour < 8 || hour > 22)) {
            System.out.println("Wake up!");
        } else {
            barking = false;
        }
        return barking;
    }


    // metoda de verificat daca pisica se joaca

    static boolean isCatPlaying(boolean summer, int temperature) {

        if (summer && (temperature >= 25 && temperature <= 45)) {

        } else if (summer == false && (temperature >= 25 && temperature <= 35)) {
            summer=true;
        } else {
            summer = false;
        }
        return summer;
    }

    // metoda Leap year

    static boolean isLeapyear(int year){

        boolean leapYear=true;

        if (year<0|| year>9999){
            leapYear=false;
        }
        else if(year % 400==0){
            leapYear=true;
        }else{
            leapYear=false;
        }
    return leapYear;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cu cate mile/h  merge masina: ");

        double kilometraj = scanner.nextDouble();


        System.out.println("Masina merge cu: " + convertToKilometersPerHour(kilometraj) + " km/h");

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Cat este ora: ");

        int ora = scanner.nextInt();
        boolean barking = true;
        System.out.println(shouldWakeUp(barking, ora));

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Cat este temperatura?");

        int temperatura = scanner3.nextInt();
        boolean summer = true;
        System.out.println(isCatPlaying(summer, temperatura));

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("In ce an suntem?");

        int anul = scanner4.nextInt();
        System.out.println(isLeapyear(anul));

    }
}
