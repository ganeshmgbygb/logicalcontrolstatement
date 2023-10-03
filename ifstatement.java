import java.util.Scanner;
public class ifstatement{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int a = sc.nextInt();
     System.out.println("enter a number");
    int b = sc.nextInt();
    if (a>b){
      System.out.println("A is bigger than B");
    }
  }
}