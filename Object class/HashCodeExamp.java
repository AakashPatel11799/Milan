 class Employee
 {
	 int id;
	 Employee(int id)
	 {
		 this.id=id;
	 }
	 public int hashCode()
	 {
		 return id;
	 }
 }
 class HashCodeExamp
 {
	 public static void main(String ar[])
	 {
		 Employee e1=new Employee(101);
		 Employee e2=new Employee(102);
		 
		 System.out.println(e1);
		 System.out.println(e2);
		 
		 System.out.println(e1.hashCode());//101
		 System.out.println(e2.hashCode());//102
	 }
 }
 /*
 output:-
Employee@65
Employee@66
101
102

#:- e1.hashCode():- same class ki hashCode method ko call  krega or usme se
     id yaani 101 orr 102 ko return kregaa..
	 
	 toString method hashcode ko hexadecimal me return krti hain isliye
	 voh yha oar 101 orr 102 ka hashcode ko hexadecimal me change krke return kregi 
	 
	 101= 64*1 + 0*16 + 1*1= 65
	 102= 64*1 + 0*16 + 1*2= 66
   
   
   Note:- ydin same hashCode return hotaa hai to iss condition ko ham  collision occur hotaa hain..
   
      solve krne ke liye:- internaly linked list ke form me seprate channing ka concept use hotaa hain//
 */