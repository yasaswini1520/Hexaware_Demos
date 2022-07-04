import java.util.Scanner;
class A
{ 
   Scanner sc=new Scanner(System.in);
   int y;
   A()
   {
      System.out.print("Enter year:");
      y=sc.nextInt();
       
    if((((y%4==0) && (y%100!=0)))|| (y%400==0))
     
       System.out.print("The entered Year "+y+" is Leap Year");
    else
       
       System.out.print("The entered Year "+y+" is not a Leap Year");

       
   }
}
class Leap
{
    public static void main(String args[])
    {
       A a=new A();
    }
}




