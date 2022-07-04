import java.util.Scanner;
class A
{ 
   Scanner sc=new Scanner(System.in);
   int a,i,fact=1;
   A()
   {
      System.out.print("Enter Number to calculate Factorial Value:");
      a=sc.nextInt();
       
      for(i=1;i<=a;i++)
      {
          fact=fact*i;
      }
       
}
}
class Maxmin
{
    public static void main(String args[])
    {
       A a=new A();
    }
}




