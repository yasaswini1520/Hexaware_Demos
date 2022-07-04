class A
{
	A()
	{
	}
	public void abc()
	{
		System.out.println("Hi");
	}
}
class B extends A
{
	B()
	{
	}
	public void abc()
	{
		System.out.println("Hello");
	}
}
class Const_Overridden
{
	public static void main(String args[])
	{
		B b=new B();
		b.abc();
	}
}