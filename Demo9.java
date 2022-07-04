class Demo9
{
	public static void main(String args[])
	{
		int arr[]={1,56,2,3,4,58};
		for(int i=0;i,arr.length;i++)
			System.out.print(arr[i]);
		System.out.print("===============");

		int a[]=new int[5];
		a[0]=10;
		a[1]=10;
		a[2]=22;
		a[3]=30;
		a[4]=45;
		//a[5]=60;
		for(int i=0;i<arr.length;i++)		
		{
			System.out.print(a[i]);
		}System.out.print("=======For Each======");

		for(int x:arr)
		{
			System.out.print(x);
		}
		System.out.print("======================");
				
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
				min=arr[i];
		}	
		System.out.print("Min : "+min);
	}
}
