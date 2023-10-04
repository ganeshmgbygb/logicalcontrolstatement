import java.util.Scanner;
public class fibanaci{
  public static void main(String args[]){
   int a=0,b=1,c=0;
    Scanner sc =new Scanner(System.in);
    System.out.println("enter a number");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
      System.out.println(a);
      c=a+b;
      a=b;
      b=c;
    }
  }
}