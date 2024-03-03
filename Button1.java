import java.awt.*;
import java.awt.event.*;
class Sky1 extends Frame implements ActionListener
{
	Sky1()
	{
		Font f = new Font ("Aharoni",Font.BOLD,30);
		setFont(f);
		setLayout (new FlowLayout());
		
		Button b1=new Button("Click!!!");
		add(b1);
		setResizable(false);
		b1.addActionListener(this);
	}
           public void actionPerformed(ActionEvent e)
		   {
		       setBackground(Color.yellow);
			   System.out.println(" SiyaaRam");
			   
		   }		   
		
}

class Button1
{
	
	public static void main(String argsd[])
	{
		
		Sky1 s1 =new Sky1();
		s1.setVisible(true);
		s1.setSize(700,500);
		s1.setLocation(200,100);
	}
}

