import java.util.Scanner;

class A
{
   int ch;
  A()
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("1)Telugu");
     System.out.println("2) Hindi");
  
     System.out.println("3) Tamil:");
    
     System.out.println("Enter your choice:");
     ch=sc.nextInt();
   
      switch(ch)
      {
         case 1:   System.out.println("You choosen Telugu");
                    break;
      
         case 2:    System.out.println("You choosen Hindi");
		    break;
     
         case 3:    System.out.println("You choose Tamil");
                    break;
       
         default:   System.out.println("You choosen English");
                    break;
}
       
}
}
class Demo6
{
  public static void main(String args[])
  {  
    A a=new A(); 
   }
}


