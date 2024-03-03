import javax.swing.*;
import java .awt.*;
import javax.script.*;
import java.awt.event.*;
class Fdemo extends JFrame implements ActionListener
{
	JButton b[]=new JButton[20];
	JTextField  tx1;
	int k=0;
	int x,y,w,h;
	String data[]={"B","C","1/X","sqrt","7","8","9","/","4","5","6","*","1","2","3","-","0",".","=","+"};
	Fdemo()
	{
		setLayout(null);
		setResizable(false);
		Font f=new Font("Arial",Font.ITALIC,40);
		setTitle("Calculator");
		tx1=new JTextField();
		tx1.setSize(400,100);
		tx1.setLocation(0,0);
		tx1.setFont(f);
		tx1.setHorizontalAlignment(JTextField.RIGHT);
		add(tx1);
		x=0;
		y=100;
		w=100;
		h=100;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=4; j++)
			{
				b[k]=new JButton(data[k]);
				b[k].setSize(w,h);
				b[k].setLocation(x,y);
				b[k].setFont(f);
				add(b[k]);
				b[k].addActionListener(this);
				k++;
				x=x+100;				
			}
			x=0;
			y=y+100;
		}
	}	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b[0])
		{		
			String s1=tx1.getText();
			tx1.setText(s1.substring(0,s1.length()-1));
		}
		else if(e.getSource()==b[1])
		{	
			tx1.setText("");
		}
		else if(e.getSource()==b[2])
		{
			String s1=tx1.getText();
		    double a= Double.parseDouble(s1);
			a=1/a;
			tx1.setText(""+a);
		}
		else if(e.getSource()==b[3])
		{
			String s1=tx1.getText();
			double a= Double.parseDouble(s1);
			tx1.setText(""+Math.sqrt(a));
		}
		else if(e.getSource()==b[18])
		{
			String s1=tx1.getText();
			ScriptEngineManager sem = new ScriptEngineManager();
			ScriptEngine se= sem.getEngineByName("js");
			try
			{
			tx1.setText(""+se.eval(s1));
			}
			catch(Exception exc) {}
		}
		else
		{
		JButton b1= (JButton)e.getSource();
		String s1=tx1.getText()+b1.getLabel();
		tx1.setText(s1);
		}		
	}
}	
class Calculator
{
	public static void main(String args[])
	{
		Fdemo f1=new Fdemo();
		f1.setVisible(true);
		f1.setSize(420,650);
		f1.setLocation(200,100);
		f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
	}
}

	
	
	
