import java.util.Scanner;
class A
{ 
   Scanner sc=new Scanner(System.in);
   int n,avg,i;
   
   A()
   {
      System.out.print("Enter Number of Subjects:");
      n=sc.nextInt();
       int[] a=new int[n];
       for(i=0;i<n;i++)
       { 
          System.out.println("Enter subject marks:");
          a[i]=sc.nextInt();
       }
       for(i=0;i<n;i++)
       {
          avg=avg+a[i];
       }
       System.out.print("Average Marks:"+avg/n);
       
   }
}
class Average
{
    public static void main(String args[])
    {
       A a=new A();
    }
}




