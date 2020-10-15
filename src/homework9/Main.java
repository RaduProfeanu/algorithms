package homework9;

import java.util.Scanner;

abstract class Book {
    String title;

    abstract String setTitle(String s);

//    String getTitle() {    --- feels like this code is redundant
//        return title;
//    } -----feels like this code is redundant

}

class MyBook extends Book {

    // String title="A tale of two cities"; --- used to hard code result

    public MyBook() {
    }

    @Override
    String setTitle(String s) {
        return s;
    }
    //   String getTitle(title)    --- used to hard code result
    // {
    //   return title;
    //}---- used to hard code result
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        MyBook new_novel = new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: " + new_novel.setTitle(title));  // modified getTitle into setTitle
        sc.close();

    }
}
