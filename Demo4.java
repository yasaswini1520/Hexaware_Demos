import java.util.Scanner;
class Emp
{
    Scanner sc=new Scanner(System.in);
    int id;
    String name;
    int age;
    int salary;
    String designation;
    Emp()
    {
        System.out.print("Enter ID:");
         id=sc.nextInt();

        System.out.print("Enter Name:");
         name=sc.next();

         System.out.print("Enter Age:");
         age=sc.nextInt();

       System.out.print("Enter Salary:");
         salary=sc.nextInt();

        System.out.print("Designation:");
         designation=sc.next();
    }
     void display()
     {
      System.out.println("ID:"+id);
      System.out.println("Name:"+name);
      System.out.println("Age:"+age);
      System.out.println("Salary:"+salary);
      System.out.println("Designation:"+designation);
   }
}        
class Demo4
{
   public static void main(String args[])
   {
      Emp e=new Emp();
       e.display();
   }
}