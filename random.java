import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main( String args[] ) {
  random.logic();
   }
   public static void logic(){
        int max=100;
        int min=10;
        int count=0;
      Random rand = new Random(); 
      int  random = rand.nextInt((max - min+1)) +min; 
      System.out.println("ganterted integer value from 10 to 100 guess it ");
      int user;
       do {
            Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
         user =sc.nextInt();
        count++;
        
           if(  user< random)
           {
               System.out.println("too low try again");
           }else if(user >random)
           {
               System.out.println("too high try agin");
           }else
           {
               System.out.println("its correct.you gussed it in "+ count +" no. of counts");
           
           }
        }while (user !=random);
    
    }
}