class Akash15
{
public static void main(String arg[])
{
	int i;

	
      for(i=2; i<=50; i++)
	  {
		  if(isPrime(i))
		  {
			  System.out.print(" "+i);
		  }
	  }
}

public static boolean isPrime(int n)
{
	int i;
	int t=0;
	for(i=2; i<n;i++)
	{
		if(n%i==0)
		{
			t=1;
		}
	}
	return  t==1;
}
}