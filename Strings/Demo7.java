class Demo7 
{
	public static void main(String args[])
	{
		String name="Ramesh";
		System.out.println(name.toUpperCase());
		
		System.out.println(name.toLowerCase());

		System.out.println(name.endsWith("h"));

		System.out.println(name.isEmpty());

		System.out.println(name.length());

		System.out.println(name.replace('m','k'));

		System.out.println(name.trim().length());

		String job=" I am a Java Developer working in Hexaware";
		//String[] words=job.split("\s");
		//for(String w:words)
		//{
			
		//System.out.println(w);
		//}
		String n2="Prathap";
		String n3="prathap";
		
		System.out.println(n2.equals(n3));
		System.out.println(n2.equalsIgnoreCase(n3));
		System.out.println(job.substring(5));
		System.out.println(job.substring(0,9));
	}
}