class A extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<=10;i++)
			{
				System.out.println("I: "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException ie)
		{
		}
	}
}
class Demo2
{
	public static void main(String args[])
	{
		A a=new A();	
		Thread t1=new Thread();
		Thread t1=new Thread();
		t1.start();
		t1.start();
		t1.setName("1");
		t2.setName("1");