abstract class RBIBank
{
	//mandatory rules and regulation methods
	abstract void loan();
	abstract void account();
	abstract void OT();
	abstract void ATM();
	void aaa(){}
	void xxx(){}
}
class SBI extends RBIBank
{
	void ATM(){}
	void account(){}
	void OT(){}
	void loan(){System.out.println("5%");}
}
class Axis extends RBIBank
{
	void ATM(){}
	void account(){}
	void OT(){}
	void loan(){System.out.println("10%");}
}
class Demo3
{
	public static void main(String args[])
	{
	
	}
}
