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
    void draw()
    {
     }
    void draw(int r)
    {
       //area of circle=pi*r*r
	System.out.println(3.14*r*r);
     }
     void draw(int l,int b)
    {
       //l*b
	System.out.println(l*b);
     }   
}
class Const_Meth_Overloading
{    
    public static void main(String args[])
    {
    
        A a= new A();
	A a1= new A(100);
	A a2= new A(1000,"Yasaswi");
	A a3= new A(100,200,"Yasaswi"); 
	a.draw(100);
	a.draw(100,200);   
    }

 

}
 