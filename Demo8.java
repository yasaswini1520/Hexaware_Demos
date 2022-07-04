class Bank
 {
     public void eduloan()
     {
           System.out.println("7 % ");
     }
     
}
class Sbi extends Bank
{
    public void eduloan()
     {
           System.out.println(" 8  % ");
     }
}
class Axis extends Bank
{
    public void eduloan()
     {
           System.out.println(" 9  % ");
     }
}
public class Demo8
{
 	public static void main(String[] args)
	 {
        
            Sbi s=new Sbi();
            s.eduloan();
         } 

}​​​​​​