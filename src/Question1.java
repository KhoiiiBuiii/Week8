
import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;

public class Question1 {
   public static void main(String[] args) throws IOException {
       String name, address;
       int age;
       Scanner scanner = new Scanner(System.in);
       PrintWriter pw = new PrintWriter(new FileWriter("src\\user.txt", true));
       System.out.println("Enter your name");
       name = scanner.nextLine();
       System.out.println("Enter your address");
       address = scanner.nextLine();
       System.out.println("Enter your age");
       age = scanner.nextInt();
       pw.println(name + ","+ address+","+ age);
       pw.flush();
       pw.close();
       // exercise 2
       Scanner fileScanner = new Scanner(new File("src\\user.txt"));
       String line;
       double sum = 0;
       int count = 0;

       while (fileScanner.hasNext()){
           count++;
           line = fileScanner.nextLine();
           StringTokenizer reader = new StringTokenizer(line, ",");

           if (reader.countTokens() !=3){
               throw  new IOException("Invalid input format!");
           } else {
               name = reader.nextToken();
               address = reader.nextToken();
               age = Integer.parseInt(reader.nextToken());
               sum += age;
           }
           System.out.println(name + " Lives at " +address+ " and is " +age+ " year old");

       }
    }

}
