import java.util.Scanner;
class Emp
{	
	String name;
	int age;
	int salary;
	String desig;
	int count=0;
	Emp()
 	{
		Scanner sc=new Scnner(System.in);
		System.out.print("Enter Name:");
		name=sc.nextInt();
		System.out.print("Enter Age:");
		age=sc.nextInt();
	}
	public void display();
	{
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
	}
}
class Clerk extends Emp
{
	Clerk()
	{
		System.out.println("Designation : Clerk");
		System.out.println("Salary : 15000");
 	}
	public void raisesalary()
	{
		salary=salary+5000;
	}
}
class Tester extends Emp
{
	Tester()
	{
		System.out.println("Designation : Tester");
		System.out.println("Salary :  25000");
 	}
	public void raisesalary()
	{
		salary=salary+1000;
	}
}
class Developer extends Emp
{
	Developer()
	{
		System.out.println("Designation : Developer");
		System.out.println("Salary : 35000");
 	}
	public void raisesalary()
	{
		salary=salary+20000;
	}
}
class Manager extends Emp
{
	Manager()
	{
		System.out.println("Designation : Manager");
		System.out.println("Salary  :  60000");
 	}
	public void raisesalary()
	{
		salary=salary+30000;
	}
}
class EmpDetails
{
	public static void main(String args[])
	{
		int n,n1;
		Scanner sc=new Scanner(System.in);
		do
		{
		System.out.println("*******************************************");
		System.out.println("1.Create \n 2.Display \n 3.Raise Salary \n 4.Exit");
		System.out.println("*******************************************");
		System.out.println("Enter your choice:");
		n=sc.nextInt();
		Emp e;
		Clerk c;
		Programmer p;
		Manager m;
		Tester t;
		
		if(n==1){
		do
		{
			System.out.println("*******************************************");
		        System.out.println("1.Clerk \n 2.programmer \n 3.Manager \n 4.Tester \n 5.Exit");
			System.out.println("*******************************************");
			System.out.println("Enter your choice:");		
			n1=sc.nextInt();
			
			switch(n1)
			{
				case 1:  e=new Emp();
					 c=new Clerk();
					 break;
				case 2:  e=new Emp();
					 p=new Programmer();
					 break;
				case 3:  e=new Emp();
					 m=new Manager();
					 break;
				case 4:  e=new Emp();
					 t=new Tester();
					 break;
			}
		
		}while(n1!=5);
   		}
		if(n==2)
		{
			c.Clerk();
			p.Programmer();
			m.Manager();
			t.Tester();
		}
		if(n==3)
		{
			c.raisesalary();
			p.raisesalary();
			m.raisesalary();
			t.raisesalary();
		}
 		}while(n!=4);
	}
}
		










