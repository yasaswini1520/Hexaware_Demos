import java.util.Scanner;
class A
{
  Scanner sc=new Scanner(System.in);
  A()
  {
    int i=1;
    for(i=0;i<=10;i++)
    {
       if(i==5)
          continue;
       System.out.println(i);
    }
    System.out.println("While loop Demo..");
    int j=1;
    while(j<=10)
    {
       System.out.println(j);
       j++;
    }
    System.out.println("do-While loop Demo..");
    int k=1;
    do
    {  
        System.out.println(k);
        k++;
    }while(k<=10);
  }
}
class Demo7
{
   public static void main(String args[])
   {
     A a=new A();
    }
}