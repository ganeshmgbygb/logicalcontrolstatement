import java.util.Scanner;
public class wtable{
  public static void main(String args[]){
    int i=1;
    Scanner sc =new Scanner(System.in);
    System.out.println("enter a number");
    int n=sc.nextInt();
    while( i<20){
       int num=i*n;
      i++;
      System.out.println(n+"*"+i+"="+num);
    }
  }
}
     