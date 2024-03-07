class Empl
{
	int id;
	String add;
	Empl(int id, String add)
	{
		this.id=id;
		this.add=add;
	}
	void show()
	{
		System.out.println("id ="+id);
		System.out.println("add ="+add);
	}
}
class BenefitConsructor
 {
	 public static void main(String ar[])
	 {
		Empl ram=new Empl(111,"indore");
        Empl sita=new Empl(222,"bhopal");

          ram.show();		
          sita.show();		
	 }
 }
 /*
 output:-
id= 111
add= indore
id= 222
add= bhopal


#:- har 1 object ke corresponding instance variable li seprate memory
allocate hotin hain..
 
#:-  1.constructor is to initialize the instance variable.
     2. same Name as class Name..
	 3. constructor is automatically calles when class of object is created .
	 4.constructor has no return type
	 
	 
#:  company m employee ke entry hoti hin at a time uski property initialize 
	 krta hain constructor..
	 
 */