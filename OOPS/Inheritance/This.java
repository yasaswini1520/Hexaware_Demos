class A
{
    A()
    {
        this(100);
        System.out.println(" A ()");
    }
    A(int  a )
    {
        System.out.println(" A (int a )");
    }    
}
class This
{    
    public static void main(String args[])
    {
    
        A a= new A();    
    }

 

}
 