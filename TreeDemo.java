import java.util.*;
public class TreeDemo
{
public static void main(String args[])
{
TreeSet al=new TreeSet();
al.add(100);
al.add(550);
al.add(1200);
al.add(999);
al.add(666);
al.add(777);
al.add(999);
Iterator il=al.iterator();
while(il.hasNext())
  System.out.println(il.next());
}
}