import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a number");
        int x = sc.nextInt();
        System.out.println("enter a number");
        int y = sc.nextInt();
        System.out.println("enter a number");
        int z = sc.nextInt();
      if (x == y && y == z ){
        System.out.println("Equilateral Triangle");
    }else if (x == y || y == z || z == x ){
        System.out.println("Isosceles Triangle");
    }else{
        System.out.println("Scalene Triangle");
}
    
    }
}