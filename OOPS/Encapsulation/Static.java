class A
{
	static void main()
	{
		System.out.println("Main method with static ");
	}
}
class B
{
	void abc()
	{
		System.out.println("Hi Method");
	}
}
class Static
{
	public static void main(String args[])
	{
		B b=new B();
		b.abc();

		//A a=new A();
		//a.abc();
		A.main();  //class_name.methodname
				  //static,no need of creating
	}
}

//no need to create an object-static