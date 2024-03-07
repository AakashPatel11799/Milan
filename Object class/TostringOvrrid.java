 // tostring() method ko  kyun ovveride krtey kartey hain..?
class Employee
{
	int id;
	String add;
	Employee(int id, String add)
	{
		this.id=id;
		this.add=add;
	}
	
	public String toString()
	{
		return "id= "+id + "\t add= "+add;
	}
} 
class TostringOvrrid
 {
	 public static void main(String ar[])
	 {
		 Employee ram =new Employee(101,"indore");
		 Employee sita =new Employee(102,"ratlam");
		 
		 System.out.println(ram);
		 System.out.println(sita);
	 }
 }
 /*
 output:-
 id= 101  add= indore
id= 102  add= ratlam

#:- 1. kisi bhi object ko print krne par uss object ke corresponding toString() method 
    call ho jaatin hain ..
	
	2.jis class ka object hain yadin uss class ke pass toString method ovveride nhi hain 
	to uss condition par fir object class ki toString() method call hotin hain..
	
	
	3.Object class ki toString() Method output ko class_name@HDN ke form m return krti hin...
	
	4.object class ki toString Method jo ki output ko [ class_name@HDN ]ke form
	me return krti hin vo hamare liye /(user k liye) meanning less hain..
	
	***:- Meanning full output ko print/display krne ke purpose se ham 
	object class ki toSting() method ko ovveride ketey hain...
 */