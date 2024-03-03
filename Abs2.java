abstract class A
{
 //void show();	
 abstract void show();	
 abstract void show2();	
 

}

 class B extends A
//abstract class B extends A
{
   void show ()
   {
	   System.out.println("class b");
   }
}

class Abs2
{
	public static void main(String args[])
	{
	//A a1=new A();	
	B a1=new B();
      a1.show();	
	
	}
}