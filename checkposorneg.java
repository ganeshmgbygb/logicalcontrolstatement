//Write a Java program that takes an integer as input and checks if it's a positive, negative, or zero. If the input is positive, print "Positive," if it's negative, print "Negative," and if it's zero, print "Zero.
import java.util.Scanner;
public class checkposorneg{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int a = sc.nextInt();
   if(a<0){
       System.out.println("its a negative number");
   }else if(a>0){
       System.out.println("its is positive number");
   }else {
       System.out.println(" zero");
   }
    }  
  }