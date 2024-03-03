import java.awt.*;
import java.awt.event.*;
class Sky1 extends Frame implements ActionListener
{
	Button b1,b2,b3;
	Sky1()
	{
		Font f = new Font ("Aharoni",Font.BOLD,30);
		setFont(f);
		setLayout (new FlowLayout());
		
		b1=new Button("!Red!");
		add(b1);
		b2=new Button("!Green!");
		add(b2);
		b3=new Button("!Blue!");
		add(b3);
		setResizable(false);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
           public void actionPerformed(ActionEvent e)
		   {
		       if(e.getSource()==b1)
			   {
			   setBackground(Color.red);
			   
			   }
			     if(e.getSource()==b2)
			   {
			   setBackground(Color.green);
			   }
			  
			    if(e.getSource()==b3)
			   {
			   setBackground(Color.blue);
			   }
			  
			  
		   }		   
		}

class Button3
{
	
	public static void main(String argsd[])
	{
		
		Sky1 s1 =new Sky1();
		s1.setVisible(true);
		s1.setSize(700,500);
		s1.setLocation(200,100);
	}
}

