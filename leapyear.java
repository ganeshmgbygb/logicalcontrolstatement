 import java.util.Scanner;
public class leapyear{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the year");
    int year=sc.nextInt();
    if(year%4==0){
      System.out.println("it is a leapyear");
    }else if(year%100==0){
      System.out.println("it is leapyear");
    }else {
      System.out.println("it is not a leapyear");
    }
  }
}