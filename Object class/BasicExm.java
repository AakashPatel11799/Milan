class Employee
 {
	 public String get()
	 {
		 return "ram";
	 }
 }
 class BasicExm
 {
	 public static void main(String ar[])
	 {
		 Employee e1=new Employee();
		 
		 System.out.println(e1.get());//ram
		 System.out.println(e1.get().length());//3
	 }
 }
		 