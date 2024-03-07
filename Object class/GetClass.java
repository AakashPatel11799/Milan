class AakashMilan
{}	
public class GetClass
{
	public static void main(String ar[])
	{
		AakashMilan a1=new AakashMilan();
		
		System.out.println(a1);
		System.out.println(a1.getClass());
		System.out.println(a1.getClass().getName());
		// System.out.println(a1.show());//cannot find symbol
                //System.out.println(a1.show());
	}
}
/*
output:-
AakashMilan@15db9742
class AakashMilan
AakashMilan
cannot find symbol:-method show();


getclass():- (class Class_name) ke form me print krta hain
getclass().gtName():- only (Class_name) ke form me return/print krta hain
*/