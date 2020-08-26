package homework2;

public class algorithms {

    public static void main(String[] args) {

        int[] intArrayExplicit=new int[]{20, 35, -15, 7, 55, 1, -22};

        int max=intArrayExplicit[0];
        int min=intArrayExplicit[0];

        for (int k=0;k<=intArrayExplicit.length-1;k++){

            if(intArrayExplicit[k]>max){
                max=intArrayExplicit[k];
            }if (intArrayExplicit[k]<min){
                min=intArrayExplicit[k];
            }
        }
        System.out.println("maximul este "+ max);
        System.out.println("minimul este "+ min);

    }

}
