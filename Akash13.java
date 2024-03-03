class Akash13
{
public static void main(String arg[])
{
	int i;

	
      for(i=10; i<=999; i++)
	  {
		  if(isArmstrong(i))
		  {
			  System.out.print(" "+i);
		  }
	  }
}

public static boolean isArmstrong(int n)
{
	int t=n;
	int x;
	int s=0;
	while(n!=0)
	{
		if(n<=999)
		{
			
		 x=n%10;
		 s+=x*x*x*x;
		 n=n/10;
		}
		/*
		if(n>=1000 && n<=9999)
		{
			
		 x=n%10;
		 s+=x*x*x*x;
		 n=n/10;
		}*/
		
	}
	
	return  t==s;


}
}
