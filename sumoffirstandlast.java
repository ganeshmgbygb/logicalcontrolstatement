import java.util.Scanner;
public class sumoffirstandlast{
 public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.println("enter a number");
   int n=sc.nextInt();
   
   int sum=0;

      int  lastDigit = n % 10;
        
        while(n != 0)
        {
           int firstDigit = n % 10;
            n = n / 10;
            sum=lastDigit+firstDigit;
            
        }
        System.out.println("sum of first and last numbers: "+sum);
    }
}