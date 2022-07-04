class Demo6 extends Thread
{
	public static void main(String args[])
	{
		String n1=new String("Ramesh");//string is immutuable: not changable
		n1.concat("Kumar");
		System.out.println(n1);
		
		StringBuffer sb=new StringBuffer("Suresh");//mutable-we can chnage or modify
		sb.append("Kumar");
		System.out.println(sb);

		StringBuilder sbb=new StringBuilder("Suresh");//mutable-we can chnage or modify
		sbb.append("Kumar");
		System.out.println(sbb);
	}
}