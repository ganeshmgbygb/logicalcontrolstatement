import java.util.Scanner;
import java.lang.*;

public class statentment2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a value");
    int a = sc.nextInt();
    System.out.println("Enter b value");
    int b = sc.nextInt();
     System.out.println("Enter c value");
    int c = sc.nextInt();
    if(a>=b && a>=c){
      System.out.print(a);
    } else if(b>=a && b>=c){
      System.out.println(b);
    }
    else{
      System.out.println(c);
    }

  }
}