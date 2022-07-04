import java.util.*;
class MapDemo
{
	public static void main(String args[])
	{
		//Map m=new Map(); key and value
		//HashMap-- no duplicate no order
		//LinkedHashMap-- no duplocate,user entered order
		//TreeMap-- No duplicate,sorted order
    		TreeMap map=new TreeMap();
		map.put(111,"Ramesh");
		map.put(222,"Rakesh");
		map.put(333,"Rajesh");
		map.put(595,"Ramesh");
		map.put(999,"Suresh");
		map.put(555,"mahesh");
		
		System.out.println(map);
		
		Set s=map.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext())
			System.out.println(i.next());
	}
}