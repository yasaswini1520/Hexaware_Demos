class A
{
   A()
   {
     System.out.print("A CLASS");
    }
}
class B extends A
{
   B()
   {
     System.out.print("B CLASS");
   }
}
class Inherit2
{
    public static void main(String args[])
     {
        B b=new B();
     }
}