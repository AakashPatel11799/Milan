class Customer
{
	String toString()
	{
		return "ramji";
	}
}
class ErrorWAP // weaker acees  privilleges
{
	public static void main(String ar[])
	{
		Customer c1=new Customer();
		 System.out.println(c1);
		 System.out.println(c1.toString());
	}
}

/*

error :-attempting to assign weaker access privileges; was public
private -> default -> protected -> public

    #:- Object class ki toString() method :-public hain ...or public method 
         public access specifier se hi acess hogin ..

*/