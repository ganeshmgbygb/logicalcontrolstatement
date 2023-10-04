import java.util.Scanner;
public class triangle{
  public static void main(String args[]){
    int j,k,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the pyamid");
    int pyd=sc.nextInt();
    for(i=1;i<=pyd;i++){
      for(j=0;j<=pyd-1;j++){
        System.out.println(" ");
      }
      for( k=1;k<=2*i-1;k++){
         System.out.print(k);
      }
    }
  }
}