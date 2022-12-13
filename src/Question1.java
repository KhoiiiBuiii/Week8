import javax.swing.*;
import java.util.Scanner;
import java.io.*;

public class Question1 {
   public static void main(String[] args) {
       File myObj = new File("User.txt");
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter your name");
       String name = scanner.nextLine();
       System.out.println("Enter your address");
       String address = scanner.nextLine();
       System.out.println("Enter your age");
       String age = scanner.nextLine();
       PrintWriter pw = null;
       try {
           pw = new PrintWriter(new FileWriter("src\User.txt", false));
           Object age;
           pw.println("%d\%d\%n", name, address, age);
       }


    }

}
