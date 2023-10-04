import java.util.Scanner;
public class pyamid{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the pyamid");
    int pyd=sc.nextInt();
    for(int i=1;i<=pyd;i++){
      for(int j=0;j<=pyd-1;j++){
        System.out.println(" ");
      }
      for(int k=1;k<=2*i-1;k++){
         System.out.print("*");
      }
    }
  }
}