class Employee
{}
class SameHDN
{
	public static void main (String ar[])
	{
		Employee e1=new Employee();
		System.out.println(e1);// 1
		System.out.println(e1.toString());// 2
		
	}
}
/*
output:-
Employee@15db9742
Employee@15db9742

1 or 2
 both are same statement ..
  line 1 or line 2 dono la matlab same hi hain.
  
   #:- jab kabh bhi ham kisi bhi object ko print krtey hain to iss condition par 
     object class ki tostring() method call ho jaaati hain.
  
  #:- object class ki tostring() method output ko [class-name@HexaDecimalNumber ] 
      ke form me return karti hain
  
*/