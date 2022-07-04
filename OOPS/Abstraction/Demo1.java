class A
{
	A()
	{
		System.out.println("A");
	}
	void abc()
	{
		System.out.println("A method some logic");
	}
}
abstract class B
{
	B()
	{
		System.out.println("B");
	}
	abstract void abc();
	void xyz()
	{
		System.out.println("B method some logic");
	}
}
class Demo1
{
	public static void main(String args[])
	{
		A a=new A();
		//B b=new B();
		a.abc();
		//b.abc();
	}
}

// class 				abstract
// A a=new A();         		NO
// only have non abstract method  	it can have both
  abstract void abc()
  hiding the implementation
  how   	make methods as abstract
      		if my method is abstract them class must be abstarct
      		if may class is abstract, object can not be created