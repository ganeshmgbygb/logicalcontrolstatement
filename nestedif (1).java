import java.util.Scanner;
public class nestedif{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int a = sc.nextInt();
     if(a%2==0){
       System.out.println("it is even number");
     } else{
       System.out.println("it is an odd number");
     } 
  }
}