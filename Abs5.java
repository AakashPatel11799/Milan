// abstract class A
// {
 //void show();	
 // abstract void show();	
 // abstract void show2();	
 

// }

 // class B extends A
//abstract class B extends A
// {
   // void show ()
   // {
	   // System.out.println("class b");
   // }
// }

//abstract
abstract class A
{
	static void show()
	{
		 System.out.println("class a");
	}
	{
		 System.out.println("class c");
	}
}
class Abs5
{
	
	
	public static void main(String args[])
	{
		
	  System.out.println("class b");
	  A.show();
	
	}
}