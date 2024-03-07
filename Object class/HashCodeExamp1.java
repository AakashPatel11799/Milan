class Employee
 {
	 int id;
	 String name;
	 Employee(int id, String name)
	 {
		 this.id=id;
		 this.name=name;
	 }
	 public int hashCode()
	 {
		 return id;
	 }
 }
 class HashCodeExamp1
 {
	 public static void main(String ar[])
	 {
		 Employee e1=new Employee(101,"aaa");//Employee@65
		 Employee e2=new Employee(102,"bbb");//Employee@66
		 
		 System.out.println(e1);
		 System.out.println(e2);
	 }
 }
		 