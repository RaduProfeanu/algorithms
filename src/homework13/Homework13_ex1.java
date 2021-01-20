package homework13;

import java.io.*;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Homework13_ex1 {
    public static void main(String[] args) {

     //   long start=System.currentTimeMillis();
        try(Reader in =new BufferedReader(new FileReader("C:\\Users\\Radu\\IdeaProjects\\algorithms\\src\\resources\\Java_wiki.txt"));
            Writer out=new BufferedWriter(new FileWriter("C:\\Users\\Radu\\IdeaProjects\\algorithms\\src\\resources\\output.txt"))){

            int byteRead;

            while((byteRead=in.read())!=-1){
                out.write(byteRead);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
      //  System.out.println(String.format("File read and write took:%.2f",(System.currentTimeMillis()-start)/1000.0));

  //     try (Scanner sc=new Scanner(new FileInputStream((CharStreams.INPUT_TXT)))){
   //         var tokens= sc.tokens()
   //                 .filter((token=token.length()>5) && Character.isLetter(token.charAt(3)))
   //                 .sorted()
   //                 .distinct()
   //                 .map(String::toUpperCase)
   //                 .collect(Collectors.toList());
   //
   //         System.out.println("tokens=" + tokens);
   //     }catch (IOException ex){
   //     ex.printStackTrace();
    }


}
