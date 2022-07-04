import java.util.Scanner;
import java.math.*;
class A
{
   Scanner sc=new Scanner(System.in);
   int b,e;
   double res;
   A()
   {
      System.out.println("Enter Base Value:");
      b=sc.nextInt();

      System.out.println("Enter Exponent Value:");
      e=sc.nextInt();
      
      res=Math.pow(b,e);
      System.out.println(b+" to the power of "+e+" Value:"+res);
     }
}  
class Power
{
    public static void main(String args[])
    { 
      A a=new A();
    }
}