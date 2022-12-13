
import java.util.Scanner;
import java.io.*;

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



    }

}
