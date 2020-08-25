import java.util.Scanner;
public class homework2WhileEx5 {
public static boolean estePalindrom (int number){
        int temp=number;
        int r,sum=0;
        while(temp>0) {
        r = temp % 10;
        sum = (sum * 10) + r;
        temp = temp / 10;
        }
    return number== sum;
}


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar:");
        int numarCititDeLaTastura = scanner.nextInt();

      if   (estePalindrom(numarCititDeLaTastura)){
          System.out.println("este palindrom");
      }


    }
}
