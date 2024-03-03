class Akash14
{
public static void main(String arg[])
{
	int i;

	
      for(i=1; i<=9999; i++)
	  {
		  if(isPerfrct(i))
		  {
			  System.out.print(" "+i);
		  }
	  }
}

public static boolean isPerfrct(int n)
{
	int t=n;
	int i;
	int s=0;
	for(i=1; i<n;i++)
	{
		if(n%i==0)
		{
		 s+=i;
		 
		}
	}
	
	return  t==s;
	
}
}