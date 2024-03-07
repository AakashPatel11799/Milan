class Employee
{
	int id;
	String add;
	void get (int id, String add)
	{
		this.id=id;
		this.add=add;
	}
	void show()
	{
		System.out.println("id = "+id);
		System.out.println("add ="+add);
	}
	
}
class  GetSetMethod
{
	public static void main(String ar[])
	{
		Employee ram= new Employee();
		Employee sita= new Employee();
		
		ram.get(101,"Indore");
		sita.get(102,"Bhopal");
		
		ram.show();
		sita.show();
	}
}