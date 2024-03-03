import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class FDemo extends JFrame implements ActionListener 
{
	JTextField tx1;
	JList cb1;
	JButton b1;
	String s []={"Java","Php","html","css","js","python"};
	FDemo()
	{
		setLayout(new FlowLayout());
		Font f=new Font ("",Font .BOLD,30);
		
		tx1=new JTextField(10);
		tx1.setFont(f);
		add(tx1);
		
		//String s []={"Java","Php","html","css","js","python"};
		cb1= new JList(s);
		cb1.setFont(f);
		cb1.setVisibleRowCount(2);
		add(new JScrollPane(cb1));
		//add(cb1);
		
		b1=new JButton("Click!!");
		b1.setFont(f);
		add(b1);
		b1.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Object  o[]=cb1.getSelectedValues();
		String s2=" ";
		for(Object o1:o)
		{
			s2=s2+o1;
		}
		tx1.setText(s2);
	}
}





class Aaa1
{
	public static void main (String argcs[])
	{
		FDemo f1=new FDemo();
		f1.setVisible(true);
		f1.setSize(800,700);
		f1.setLocation(200,300);
	}
}