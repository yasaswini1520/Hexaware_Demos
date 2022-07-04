import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;
public class CollDemo2
{
public static void main(String args[])
{
	LinkedList al=new LinkedList();
al.add(100);
al.add("Yasaswi");
al.add(550);
al.addFirst(99999);
al.add(5.7777);
al.add('A');
al.add(10.6);
al.add(999);
Iterator il=al.iterator();
while(il.hasNext())
  System.out.println(il.next());
}
}