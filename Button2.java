import java.awt.*;
class Sky1 extends Frame 
{
	Sky1()
	{
		setTitle("Login Page");
		Font f = new Font ("Felix Titling",Font.BOLD,30);
		setFont(f);
		setLayout (null);
		
		Label un=new Label ("Enter Name");
		un.setSize(200,50);
		un.setLocation(100,100);
		add(un);
		
		TextField tx1= new TextField ();
		tx1.setSize(200,50);
		tx1.setLocation(300,100);
		add(tx1);
		
		Label up=new Label ("Enter Name");
		up.setSize(200,50);
		up.setLocation(100,200);
		add(up);
		
		TextField tx2= new TextField ();
		tx2.setSize(200,50);
		tx2.setLocation(300,200);
		tx2.setEchoChar('*');
		add(tx2);
		
		
		
		Button b1=new Button("LogIn!!");
		b1.setSize(120,90);
		b1.setLocation(200,300);
		add(b1);
		setResizable(false);
		
	}
}
class Button2
{
	
	public static void main(String argsd[])
	{
		
		Sky1 s1 =new Sky1();
		s1.setVisible(true);
		s1.setSize(600,500);
		s1.setLocation(200,100);
	}
}

