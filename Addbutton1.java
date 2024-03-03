import java.awt.*;
import java.awt.event.*;
class Sky1 extends Frame implements ActionListener
{
	Button b1;
	TextField tx1 ,tx2,tx3;
	Sky1()
	{
		Font f = new Font ("Aharoni",Font.BOLD,30);
		setFont(f);
		setForeground(Color.red);
		setLayout (new FlowLayout());
		tx1 = new TextField(10);
		add(tx1);
		tx2 = new TextField(10);
		add(tx2);
		b1=new Button("!!Click!!");
		add(b1);
		tx3 = new TextField(10);
		add(tx3);
		
		setResizable(false);
		b1.addActionListener(this);
		
	}
           public void actionPerformed(ActionEvent e)
		   {
		      String s1 = tx1.getText();
			  String s2 = tx2.getText();
			  int x=Integer.parseInt(s1);
			  int y=Integer.parseInt(s2);
			  int z=x+y;
			  tx3.setText(""+z);
		   }		   
		}

class Addbutton1
{
	
	public static void main(String argsd[])
	{   
	
	
		
		Sky1 s1 =new Sky1();
		s1.setVisible(true);
		s1.setSize(700,500);
		s1.setLocation(200,100);
	}
}

