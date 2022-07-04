abstract class A
{
	abstract void abc();
}
abstract class B extends A
{
	void abc()
	{
		System.out.println("Hi Over riding method");
	}
	abstract void atoz();
}
class C extends B
{
	void atoz()
	{
		System.out.println("Hi Over riding method from class");
	}
}
class Demo2
{
	public static void main(String args[])
	{
		C c=new C();
		c.atoz();
		c.abc();
	}
}