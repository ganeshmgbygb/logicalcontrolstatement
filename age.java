import java.util.Scanner;
public class age{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the age");
    int age=sc.nextInt();
    if(age<=18){
      System.out.println("You are a minor");
    }
    if(age<=65){
      System.out.println("You are adult");
    }
    if(age>=65){
      System.out.println("You are a senior citizen");
    }
  }
}
