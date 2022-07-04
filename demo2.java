class MyEmp
{
    MyEmp()
    {
       System.out.println("Hi My Emp class");
    }
    void display()
    { 
       System.out.println("Hi Method");
    }

}
class Demo2
{
    public static void main(String args[])
    { 
       MyEmp e=new MyEmp();
       // MyEmp e1=new MyEmp;
       e.display();
        e.display();
         e.display();
         e.display();
          e.display();
}
}