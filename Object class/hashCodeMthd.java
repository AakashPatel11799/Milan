// 1. hashcode Kyan Hin..?  ...2. hashCode kise kahtey hain.??

class Emp
{
	Emp()
	{
		
	}
}
class hashCodeMthd
{
	public static void main(String ar[])
	{
		Emp e1=new Emp();
		System.out.println(e1);
		System.out.println(e1.toString());
		System.out.println(e1.hashCode());
		 
	}
}
/*
output :-
Emp@15db9742
Emp@15db9742
366712642

class-Name@(HDN):- 1.  yeh jo class_name @ hdN hain ....isme jo yeh HexaDecimlNumber hain
                      isikon ham hashcode kahtey hain....
				  
				  
				     2. hashCode() kya hain..????
				  Ans:- JVM(java virtual machine) har 1 object ke corresponding
				     1 unique Number assign krta hain....isi unique
					   Number ko hashCode kahtey hain..
				  
*/