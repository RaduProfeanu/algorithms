import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti dimensiunea array-ului");
        int n = scan.nextInt();
        System.out.println("Introduceti numarul de rotatii dorite");
        int d = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        System.out.println("Introduceti array-ul");
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();

        if (d % n == 0) {
            for (int i = 0; i < n; i++){
                System.out.print(a[i] + " ");
            }

        } else {
            d = d % n;
            for (int i = 0; i < n; i++) {
                if ( i+d < n ){
                    b[i]=a[i+d];
                }else{
                    b[i]=a[i+d-n];
                }
                System.out.print(b[i] + " ");
            }
        }
    }

}
