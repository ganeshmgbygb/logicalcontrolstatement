import java.util.Scanner;
public class nestedif{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int a = sc.nextInt();
     System.out.println("enter a number");
    int b = sc.nextInt();
    if (a>10){
      System.out.println("a is graterthan 10 ");
    } elseif(a<10){
        System.out.println("a is lessthan 10 ");
    }else {
      System.out.println("a is not a number");
    }
  }
}