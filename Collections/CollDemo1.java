
import java.util.*;
public class CollDemo1 
{
	public static void main(String args[])
	{
		
		ArrayList<E> al=new ArrayList();
		al.add(100);
		al.add("Yasaswi");
		al.add(true);
		al.add(10.6);
		al.add(new Date());
		al.add(new Thread());
		
		System.out.println(al);
		
		System.out.println("===========");
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("=====Iterator=====");
		
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
	
		}

	}
}
