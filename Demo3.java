import java.util.Scanner;
class Emp
{
Scanner sc=new Scanner(System.in);
Emp()
{
System.out.println("Enter Name:");
  String name=sc.next();
System.out.println("Enter age:");
  String age=sc.next();
System.out.println("Name:"+name);
  System.out.println("Age:"+age);
}
}
class Demo3
{
public static void main(String args[])
{
Emp e=new Emp();
}
}

