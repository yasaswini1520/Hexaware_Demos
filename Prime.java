import java.util.Scanner;
class A
{
    Scanner sc=new Scanner(System.in);
    int i,n;
    boolean flag=false;
    Rectangle()
    {
       System.out.print("Enter width of the rectangle:");
       w=sc.nextInt();

       System.out.print("Enter Height of the rectangle:");
       h=sc.nextInt();
       
       System.out.println("Area of Rectangle:"+w*h);
    }
    circle()
    {
       
       System.out.print("Enter Radius of the circle:");
       r=sc.nextInt();
     
       System.out.println("Area of Circle:"+pi*r*r);
    }
}
class Prime
{
    public static void main(String args[])
    { 
      A a=new A();
    }
}