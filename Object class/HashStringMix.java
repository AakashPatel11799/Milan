class Emp
{
	int id;
	String name;
	Emp(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		//return getClass();//incompatible types: Class<CAP#1> cannot be converted to String
		//return getClass().getName();// Emp
		// return getClass().getName() +"@";// Emp@
		//return getClass().getName() +"@" + hashCode();// Emp@101  Emp@101
		return getClass().getName() +"@" + Integer.toHexString(hashCode());// Emp@65  Emp@66
	}
	public int hashCode()
	{
		return id;
	}
}
class HashStringMix
{
	public static void main(String ar[])
	{
		Emp e1=new Emp(101,"ram");
		Emp e2=new Emp(102,"sita");
		
		System.out.println(e1);
		System.out.println(e2);
	}
}
/*
internally Working of toString() method:-
public String toString()
	{
		return getClass().getName() +"@" + Integer.toHexString(hashCode());
	}
*/