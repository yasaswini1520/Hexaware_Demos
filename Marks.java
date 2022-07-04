import java.util.Scanner;

class A
{
  A()
  {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter Name:");
      String name=sc.next();
     System.out.print("Enter Telugu MArks:");
     int t=sc.nextInt();
     System.out.print("Enter Hindi MArks:");
     int h=sc.nextInt();

      System.out.print("Enter English MArks:");
     int e=sc.nextInt();
    
     System.out.print("Enter Maths MArks:");
     int m=sc.nextInt();

     System.out.print("Enter Science MArks:");
     int s=sc.nextInt();
     
      System.out.print("Enter Social MArks:");
     int ss=sc.nextInt();
   
      int total=t+h+e+m+s+ss;
       int per=total/6;

      if(per>=85)
      {
          System.out.println("Hi!"+name+"you got"+total+"and you got"+per+"  Distinction");
       }
       else if(per>60 && per<85)
      {
          System.out.println("Hi!"+name+"you got"+total+"and you got"+per+"  First class");
       }
     else if(per>50 && per<60)
      {
          System.out.println("Hi!"+name+"you got"+total+"and you got"+per+"  Second class");
       }
       else if(per>35 && per<50)
      {
          System.out.println("Hi! "+name+" your total marks "+total+"and you got"+per+"  Just Pass");
       }
      else 
      {
          System.out.println("Hi!"+name+"you got"+total+"and you got"+per+"  Fail");
       }
}
}
class Marks
{
  public static void main(String args[])
  {  
    A a=new A(); 
   }
}


