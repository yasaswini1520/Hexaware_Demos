import java.util.Scanner;

class Developer 
{
	Scanner sc=new Scanner(System.in);
	int id;
	String name;
	int age;
	int salary ;
	String desig;
	void create()
	{
		System.out.println("**********************************************************");
		System.out.print("Eter Id : ");
		  id=sc.nextInt();

		System.out.print("Enter Name : ");
		 name= sc.next(); 

		System.out.print("Enter Age : ");
		 age =sc.nextInt();
		System.out.println("You have inserted the Developer data Successfully....");
		System.out.println("***********************************************************");
		salary =500000;
		desig="Developer ";	
	}
	void display()
	{
			System.out.println("********************************");
			System.out.println(" ID : " + id );
			System.out.println("Name : " + name);
			System.out.println("Age : " + age );
			System.out.println("Salary : " + salary  );
			System.out.println("Designation : " + desig);
			System.out.println("********************************");
	}
	void raiseSalary()
	{
		salary = 50000;
		salary=salary+20000;
		System.out.println("Raised salary of Developer : "+salary);
	}
}
class Manager  
{
	Scanner sc=new Scanner(System.in);
	int id;
	String name;
	int age;
	int salary ;
	String desig;
	void create()
	{
		System.out.println("****************************************************");
		System.out.print("Enter Id : ");
		  id=sc.nextInt();

		System.out.print("Enter Name : ");
		 name= sc.next(); 

		System.out.print("Enter Age : ");
		 age =sc.nextInt();
		System.out.println("You have inserted the Manager data Successfully....");
		System.out.println("****************************************************");
		salary =90000;
		desig="Manager ";	
	}
	 void display()
	{
			System.out.println("********************************");
			System.out.println(" ID : " + id );
			System.out.println("Name : " + name);
			System.out.println("Age : " + age );
			System.out.println("Salary : " + salary  );
			System.out.println("Designation : " + desig);
			System.out.println("********************************");
	}
	void raiseSalary()
	{
		salary = 90000;
		salary=salary+30000;
		System.out.println("Raised salary of Manager : "+salary);
	}
}
class Clerk 
{
	Scanner sc=new Scanner(System.in);
	int id;
	String name;
	int age;
	int salary ;
	String desig;
	void create()
	{
		System.out.println("****************************************************");
		System.out.print("Enter Id : ");
		  id=sc.nextInt();

		System.out.print("Enter Name : ");
		 name= sc.next(); 

		System.out.print("Enter Age : ");
		 age =sc.nextInt();
		System.out.println("You have inserted the Clerk data Successfully....");
		System.out.println("*****************************************************");
		salary =2000;
		desig="Clerk ";	
	}
	void display()
	{

			System.out.println("********************************");
			System.out.println(" ID : " + id );
			System.out.println("Name : " + name);
			System.out.println("Age : " + age );
			System.out.println("Salary : " + salary  );
			System.out.println("Designation : " + desig);
			System.out.println("********************************");
	}
	void raiseSalary()
	{
		salary = 2000;
		salary=salary+5000;
		System.out.println("Raised salary of Clerk"+salary);
	}
}

class Tester 
{
	Scanner sc=new Scanner(System.in);
	int id;
	String name;
	int age;
	int salary ;
	String desig;
	void create()
	{
		System.out.println("****************************************************");
		System.out.print("Enter Id : ");
		  id=sc.nextInt();

		System.out.print("Enter Name : ");
		 name= sc.next(); 

		System.out.print("Enter Age : ");
		 age =sc.nextInt();
		System.out.println("You have inserted the Tester data Successfully....");
		System.out.println("****************************************************");
		salary =25000;
		desig="Tester ";	
	}
	void display()
	{
		
			System.out.println("********************************");
			System.out.println("ID : " + id );
			System.out.println("Name : " + name);
			System.out.println("Age : " + age );
			System.out.println("Salary : " + salary  );
			System.out.println("Designation : " + desig);
			System.out.println("********************************");
	}
	void raiseSalary()
	{
		salary =25000;

		salary=salary+1000;
		System.out.println("Raised salary of Tester : "+salary);

	}
}
class Details
{
	public static void main(String args[])
	{

		
		Scanner sc=new Scanner(System.in);
		Developer de=new Developer();
		Manager ma=new Manager();
		Clerk cl=new Clerk();
		Tester te=new Tester();
		System.out.println("1.Create ");		
		System.out.println("2.Display ");
		System.out.println("3.Raise salary ");
		System.out.println("4.Exit ");
		int d,d1;
		while(true)
		{
			d=sc.nextInt();
			switch(d)
			{
				case 1: System.out.println("Enter type of employee you want to create : ");
					System.out.println("1.Developer ");		
					System.out.println("2.Manager");
					System.out.println("3.Clerk");
					System.out.println("4.Tester");
					System.out.println("5.Exit ");
						d1=sc.nextInt();
						switch(d1)
						{
							case 1: System.out.println("Enter Developer Details");
									de.create();
									break;
							case 2: System.out.println("Enter Manager Details ");
									ma.create();
									break;
							case 3: System.out.println("Enter Clerk Details");
									cl.create();
									break;
							case 4: System.out.println("Enter Tester Details");
									te.create();
									break;
							case 5: System.exit(0);
									break;
							default:
						}
						break;
				case 2: System.out.println("Display all Employee Details:");
						de.display();
						ma.display();
						cl.display();
						te.display();
						break;
				case 3: System.out.println("Raising the salary of all employees ");
						de.raiseSalary();
						ma.raiseSalary();
						cl.raiseSalary();
						te.raiseSalary();
						break;
				case 4: System.out.println("Exiting from the current session");
						break;
				default: System.out.println("You can choose options between 1 to 4 to create and display the employee details"); 
							break;
			}
			if(d==4)
				break;
		}
	}
}