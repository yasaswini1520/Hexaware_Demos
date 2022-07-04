class A
{
	int a=100;
    A()
    {
        System.out.println(" A ()");
    }
    A(int a )
    {
        System.out.println(a);
    }   
    A(int a, String name )
    {
        System.out.println(a);
    }  
    A(int a,int b, String name )
    {
        System.out.println(a);
    }    
}
class ConstructorOverloading
{    
    public static void main(String args[])
    {
    
        A a= new A();
	A a1= new A(100);
	A a2= new A(1000,"Yasaswi");
	A a3= new A(100,200,"Yasaswi");    
    }

 

}
 