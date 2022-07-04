import java.util.Scanner;
class A
{
	Scanner sc=new Scanner(System.in);
	A()
	{
		System.out.println("Enter A values:");
		int a=sc.nextInt();
		
		System.out.println("Enter B values:");
		int b=sc.nextInt();
		try
		{
			int c=a/b;
			System.out.println("Result is : "+c);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Number/0 is not possible,please enter valid number");
	
		}
	}
}
class Demo1
{
	public static void main(String args[])
	{
		A a=new A();
	}
}