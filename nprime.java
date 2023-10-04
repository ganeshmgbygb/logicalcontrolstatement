import java.util.Scanner;
public class nprime{
  public static void main(String args[]){
   int count=0;
    int j;
    Scanner sc =new Scanner(System.in);
    System.out.println("enter a number");
    int n=sc.nextInt();
    System.out.println("the prime numbers are: ");
    for(int i=2;i<=n;i++){
      for( j=1;j<=i;j++){
        if(i%j==0){
          count++;
        }
      }
      if(count==2)
      System.out.println(j);
    }
    
  }
}