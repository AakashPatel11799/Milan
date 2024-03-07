class A
{
	void show1()
	{
	    show2 ();
		System.out.println("class A show1 mthd");
	}
	void show2()
	{
		System.out.println("class A show2 mthd");
	}
}
class B extends A
{
	void show2()
	{
		System.out.println("class B show2 mthd");
	}
}
class ConOfmethdOverRidd
{
	public static void main(String args[])
	{
		B b1=new B();
		b1.show1();
	}
}
/*
output :-
class B show2 mthd
class A show1 mthd

#:-
      yha par object subclass class b ka hai isliye 
     Runtime par working Object ke correponding hoti hai
    isliye sab kuch class B ke obj ke according display/print hogaa....
	
	
	method hiding :- compile time checking -static methods - reference variable
*/