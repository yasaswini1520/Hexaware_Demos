import java.util.*;
public class HashSetDemo
{
public static void main(String args[])
{
HashSet al=new HashSet();
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