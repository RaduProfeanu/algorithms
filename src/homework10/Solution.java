package homework10;

public class Solution {

    public static int divide(int x, int y){

        try{
          int z= x/y;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return x/y;
    }

    public static void main(String[] args) {

       int z=divide(23,0);
        System.out.println("Divide is"+z);

        int w=divide(10,0);
        System.out.println(w);


    }
}
