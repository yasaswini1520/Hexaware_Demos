import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.*;
public class VectorDemo
{
public static void main(String args[])
{
	Vector al=new Vector();
al.add(100);
al.add("Yasaswi");
al.add(550);
al.add(5.7777);
al.add('A');
al.add(10.6);
al.add(999);
System.out.println("======Iterator every ehere hence it is universal cursor or iterator======");
Iterator il=al.iterator();
while(il.hasNext())
  System.out.println(il.next());

System.out.println("======List Iterator only in list but no set for map======");
ListIterator li=al.listIterator();
while(li.hasNext())
  System.out.println(li.next());

System.out.println("======Reverse======");
while(li.hasPrevious())
  System.out.println(li.previous());

System.out.println("======Enumeration only works eith older class or legacy=========");
Enumeration e=al.elements();
while(e.hasMoreElements())
  System.out.println(e.nextElement());
}
}