class Demo9
{
	public static void main(String args[])
	{
		int arr[]={1,56,2,3,4,58};
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		System.out.println("===============");

		int a[]=new int[5];
		a[0]=10;
		a[1]=10;
		a[2]=22;
		a[3]=30;
		a[4]=45;
		//a[5]=60;
		for(int i=0;i<a.length;i++)		
		{
			System.out.println(a[i]);
		}System.out.println("=======For Each======");

		for(int x:arr)
		{
			System.out.println(x);
		}
		System.out.println("======================");
				
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
				min=arr[i];
		}	
		System.out.println("Min : "+min);
	}
}
