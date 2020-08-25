import java.util.Scanner;

public class homework2WhileEx4 {
    public static void main(String[] args) {

        boolean var=false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti prima latura a triunghiului :");
        int primaLaturaATriunghiului = scanner.nextInt();
        System.out.println("Introduceti a doua latura a triunghiului :");
        int aDouaLaturaATriunghiului = scanner.nextInt();
        System.out.println("Introduceti a treia latura a triunghiului :");
        int aTreiaLaturaATriunghiului = scanner.nextInt();

        while(var==false){
            if(primaLaturaATriunghiului+aDouaLaturaATriunghiului>aTreiaLaturaATriunghiului&& primaLaturaATriunghiului+aTreiaLaturaATriunghiului>aDouaLaturaATriunghiului && aDouaLaturaATriunghiului+aTreiaLaturaATriunghiului>primaLaturaATriunghiului){
                System.out.println("Acestea sunt laturile unui triunghi");
                var=true;
            }
        }



    }
}
