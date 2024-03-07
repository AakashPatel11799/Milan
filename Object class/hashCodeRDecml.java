class Emp
{
	Emp()
	{
		
	}
}
class hashCodeRDecml
{
	public static void main(String ar[])
	{
		Emp e1=new Emp();
		
		System.out.println(e1);
		System.out.println(e1.toString());
		System.out.println(e1.hashCode());
		
		System.out.printf("%x\n",e1.hashCode());
		System.out.println(Integer.toHexString(e1.hashCode()));
		 
	}
}
/*
output:-
Emp@15db9742
Emp@15db9742
366712642

15db9742
15db9742

#:-  1. toString() method ,hashCode() ko hexadecimal(15db9742) Number 
        ke form me return krta hain....
		
#:-   2. hashCode() method.hashCode ko Decimal(366712642) Number ke form men 
         return krta hain..


*/