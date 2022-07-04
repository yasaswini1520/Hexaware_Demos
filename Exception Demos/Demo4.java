import java.io.*;
class A
{
	void abc() throws  FileNotFoundException
	{
		for(int i=0;i<=20;i++) 
		{
			System.out.println("I : "+ i);
			if (i==15)  throw new  NullPointerException();
			if (i==12)  throw new  NumberFormatException();	
			if(i==10 ) throw new ClassCastException();
			if(i==5) throw new FileNotFoundException();
		}	
	}

}
class Demo4
{
	public static void main(String args[])
	{
		try 
		{
			 A a=new A();
			a.abc();
		}
		catch( NullPointerException np)
		{
			System.out.println("Null pointer exception with some alternate messege  ");
		}
		catch(NumberFormatException nf)
		{
			System.out.println("number formate  exception with some alternate messege  ");
		}
		catch( FileNotFoundException fnf)
		{
			System.out.println("FileNotFoundException came ");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Thank you ....! ");
			//   con.close();
		}
	}
}