class Customer 
{
   public int hashCode()
   {
	    return 100;
   }
}
 class SameHashC
 {
	 public static void main (String ar[])
	 {
		 Customer c1=new Customer();
		 Customer c2=new Customer();
		 
		 System.out.println(c1);//Customer@64
		 System.out.println(c2);//Customer@64
		 
	 }
 }
 /*
 o/p:-
 
 Customer@64
 Customer@64
 
     kisi bhi object ko print krne par tostring() method call hoti hai 
	 or...tostring() method hashCode ko hexadecimal me return krti hain...
	   
	 #:- but hamne hashCode ko class customer me ovveride kr rakha hai isliye
	 ...same class ki hashCode() method  call hogi orr return 
	      ..100 ka hashcode 64 return hogaa ....
		  
		  100 :-  64*1 + 16*0 + 1*0= 64 
 
 */