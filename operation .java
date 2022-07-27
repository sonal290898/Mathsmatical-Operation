import java.util.Scanner;
public class  Main{
     public static  void main(String args[]){
         System.out.println("Plz inter your num1 ");
         Scanner sc=new Scanner(System.in);
         int num1=sc.nextInt();
         System.out.println("Your  no is="+num1);
         System.out.println("Plz inter your num2 ");
         //Scanner sc=new Scanner(System.in);
         int num2=sc.nextInt();
         System.out.println("Your  no is="+num2);
         int sum=num1+num2;
         System.out.println(sum);
         System.out.println(num1*num2);
         System.out.println(num1/num2);
         System.out.println(num1%num2);
         
     }
     
 }
