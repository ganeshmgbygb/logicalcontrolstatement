import java.util.Scanner;
public class palindrome{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int num=sc.nextInt();
     int temp=num,r,sum=0;
    while(num>0){    
   r=num%10;  
   sum=(sum*10)+r;    
   num=num/10;    
  }    
  if(temp==sum)    
   System.out.println("it is a palindrome number");    
  else    
   System.out.println("it is not a palindrome");    
}  

  }
