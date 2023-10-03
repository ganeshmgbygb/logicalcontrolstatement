import java.util.Scanner;
public class nestedif{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int a = sc.nextInt();
    System.out.println("enter a number");
    int b = sc.nextInt();
    System.out.println("enter a number");
    int c = sc.nextInt();
      if (a > b && a > c)
        printf("Biggest number is" , a);
    if (b > a && b > c)
        printf("Biggest number is ", b);
    if (c > a && c > b)
        printf("Biggest number is ", c);
     
  }
}