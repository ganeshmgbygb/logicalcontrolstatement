//even numbers 1 to n
import java.util.Scanner;
public class neven{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int n=sc.nextInt();
    System.out.println("the even numbers are:");
    for(int i=1;i<=n;i++){
      if(i%2==0){
        System.out.println(i+" ");
      }
     
    }
      
  }
}