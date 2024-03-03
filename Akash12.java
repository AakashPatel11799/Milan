class Akash12
{
public static void main(String arg[])
{
	int i;

	
      for(i=1; i<=50; i++)
	  {
		  if(isPallindrome(i))
		  {
			  System.out.print(" "+i);
		  }
	  }
}

public static boolean isPallindrome(int n)
{
	int t=n;
	int x;
	int s=0;
	while(n!=0)
	{
		 x=n%10;
		 s=s*10+x;
		 n=n/10;
	}
	return  t==s;
}
}