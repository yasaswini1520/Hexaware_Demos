import java.util.Scanner;
class A
{ 
   Scanner sc=new Scanner(System.in);
   int p,t,r;
   double SI;
   A()
   {
      System.out.print("Enter Principal Value:");
      p=sc.nextInt();
       
      System.out.print("Enter Time Value:");
      t=sc.nextInt();

      System.out.print("Enter Rate Of Interest Value:");
      r=sc.nextInt();
    
      SI=(p*t*r)/100;
     
       System.out.print("Simple Interest:"+SI);
       
   }
}
class SimpleInterest
{
    public static void main(String args[])
    {
       A a=new A();
    }
}




