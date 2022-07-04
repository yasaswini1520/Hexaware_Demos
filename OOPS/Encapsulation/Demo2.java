//POJO class
//plane old java class
//java Beans
class Emp
{
	private int id;
	private String name;

	void setId(int id)
	{
		this.id=id;
	}
	int getId()
	{
		return id;
	}
        void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
}
class Demo2
{
	public static void main(String args[])
	{
		Emp e=new Emp();
		e.setId(100);
		e.setName("Yasaswi");
		System.out.println("ID : "+e.getId());
		System.out.println("Name : "+e.getName());
	}
}


