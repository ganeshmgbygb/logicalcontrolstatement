//som of odd numbers are;
import java.util.Scanner;
public class sumofodd{
  public static void main(String args[]){
   int sum=0;
    Scanner sc =new Scanner(System.in);
    System.out.println("enter a number");
    int num=sc.nextInt();
    System.out.println("the sum of odd numbers are:");
    for(int i=1;i<=num;i++){
      if(i%2!=0){
        sum=sum+i;
      }
    }
    System.out.println(sum+" ");
  }
}