package homework9;

import java.util.Scanner;

abstract class Book{
    String title;
    abstract String setTitle(String s);
    String getTitle(){
        return title;
    }

}

 class MyBook extends Book{

    String title;
    String s;
     @Override
     String setTitle(String s){
         return null;
     }
     String getTitle(){
         return title;
     }

 }

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        MyBook new_novel=new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: "+new_novel.getTitle());
        sc.close();

    }
}
