import java.util.Scanner;
public class grade{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks");
        int marks=sc.nextInt();
        if(marks <50){
            System.out.println("fail");
            }else if(marks>50 && marks<70){
                System.out.println("grade D");
                }else if(marks>70 && marks<80){
                    System.out.println("grade C");
                }else if(marks >80 && marks<90){
                    System.out.println("grade B");
                }else if(marks >90 && marks <100){
                    System.out.println("grade A");
                }else {
                    System.out.println("invalid input");
                }
        }
    }
