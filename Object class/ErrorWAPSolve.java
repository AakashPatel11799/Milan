class Customer
{
	public String toString()
	{
		return "ramji";
	}
}
class ErrorWAPSolve // weaker acees  privilleges
{
	public static void main(String ar[])
	{
		Customer c1=new Customer();
		 System.out.println(c1);
		 System.out.println(c1.toString());
	}
}
/*

to string method ka acees specifier public hain or hamne bhi ovveride ketey samay 
public likha hai isliye error nahi aayegi..

private-> default-> protected->public iss order ka reverse jab bhi ham acees krte
hain to wearket acees privilefe was public error aati hain

 

output:-
ramji
ramji
*/