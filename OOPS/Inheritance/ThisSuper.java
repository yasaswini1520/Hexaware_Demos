class A
{
	int a=10;
}
class B extends A
{
	int a=100;
   	B(int a)
	{
  		System.out.println("A "+a);
		System.out.println("A "+this.a);//current class
		System.out.println("A "+super.a);//Super class
	}
}
class ThisSuper
{
 	public static void main(String args[])
	{
		B b=new B(1000);
	}
}