class A
{
    int a=100; 	
	int b=200;
	void m1()
	{
    	    System.out.println("m1");
	}
	void m2()
	{
    	    System.out.println("m2");
	}
}
class B extends A
{
    int c=300; 	
	int d=400;
	void m3()
	{
    	    System.out.println("m3");
	}
	void m4()
	{
    	    System.out.println("m4");
	}
}
class Inherit
{
   	public static void main(String args[])
	{
		B b=new B();
		b.m1();
		b.m2();
		b.m3();
		b.m4();
 
		System.out.println("A class");
		A a=new A();
		a.m1();
		a.m2();
	}
}