import java.util.*;

class Demo1
{
	public static void main(String args[])
	{
		ArrayList a=new ArrayList();
		a.add(100);
		a.add(200);
		a.add(300);
		a.add("Yasaswi");
		a.add(true);
		a.add('A');
		a.add(10.6);
		a.add(new Date());
		a.add(new Thread());
		a.add(new Clerk());
		System.out.println(a);
	}
}