import java.util.Scanner;

public class homework2SwitchEx {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar:");
        int numarCititDeLaTastura = scanner.nextInt();

        switch (numarCititDeLaTastura){
            case 0:
                System.out.println("Duminica");
                break;
            case 1:
                System.out.println("Luni");
                break;
            case 2:
                System.out.println("Marti");
                break;
            case 3:
                System.out.println("Miercuri");
                break;
            case 4:
                System.out.println("Joi");
                break;
            case 5:
                System.out.println("Vineri");
                break;
            case 6:
                System.out.println("Sambata");
                break;
        }
    }
}
