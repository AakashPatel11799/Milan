 class A
{
   public String tostring()
   {
     return "ram";
   }
}
 public class PublicNameClass
 {
	 public static void main(String ar[])
	 {
		 A a1=new A();
		  
		  System.out.println(a1);
		  System.out.println(a1.toString());
	 }
 }
 
 /*
 error:-class A is public, should be declared in a file named A.java
 
 yadinhamare program men 1 bhi public class  hai to uske
    name se hi java me program save krtey hain..
	
	
	more than one public class nahi bna saktey kyunki fir 
	kis name se program ko save krenge
 
 
 */