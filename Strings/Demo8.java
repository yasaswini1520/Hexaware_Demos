class Demo8 
{
	public static void main(String args[])
	{
		//StringBuffer sb=new StringBuffer("Hello");//thread safe,syncrinized
		StringBuilder sb=new StringBuilder("Hello");
		sb.append("Ramesh");
		System.out.println(sb);
		
		sb.insert(0,"Hi");
		System.out.println(sb);
		
		sb.replace(8,15,"Rakesh");
		System.out.println(sb);
	
		sb.delete(1,5);
		System.out.println(sb);

		System.out.println(sb.reverse());
	}
}