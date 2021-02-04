package homework2;

import java.util.Scanner;
import java.util.Random;

public class homework2WhileEx6 {
    public static void main(String[] args) {
        Random random=new Random();
        int randomNumber = random.nextInt(101);

        boolean condition= false;


        while (!condition) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduceti un numar:");
            int numarCititDeLaTastura = scanner.nextInt();
            if (numarCititDeLaTastura == randomNumber) {
                System.out.println("Felicitari!Ai ghicit numarul");
                condition=true;
            }else{
                System.out.println("Mai incearca");
            }


        }
    }
}
