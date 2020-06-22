class fibonacci
{
	public static void main(string[] args)
	{
		int sum,t1=1,t2=2,i;
		for(i=1;i<=89;i++)
		{
			System.out.println(t1);
			sum=t1+t2;
			t1=t2;
			t2=sum;
		}
		
	}
}