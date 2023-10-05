//priting the last and first number
import java.util.Scanner;
import java.lang.*;

public class digi {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int num =sc.nextInt();
     int firstDigit = 0;
        int lastDigit = 0;

        lastDigit = num % 10;
        System.out.println("Last Digit is" + lastDigit);        
        
        while(num != 0)
        {
            firstDigit = num % 10;
            num = num / 10;
        }
        System.out.println("First Digit is" + firstDigit);
    }
}