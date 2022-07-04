class A
{
	A(){}
	int a;
}
abstract class B
{
	B(){}
	int b;
}
interface I
{
	//I(){}
	//int i; we havw assign
	int x=100;	
}
interface J
{
}
interface K extends J,I
{
}
class Demo4
{
	public static void main(String args[])
	{
 		//A a=new A();

	}
}

//		class			abstract		 	interface
//obj:    	yes			no				no
//const 	yes			yes				no
//int a;  	yes			yes				no,wehave to assign
//method  	only normal		can be both abstract and non	only abtsract
//		con method
//		non abstarct methods
//Security:	0			0-100				100
//multiple 
inheritance 	no 			no 				yes