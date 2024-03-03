import java .awt.*;
import java.awt.event.*;

class FDemo extends Frame implements ActionListener
{ 

   Button b1,b2,b3,b4;
   boolean a1=false;
   boolean r1=false;
   boolean o1=false;
   boolean s1=false;
   FDemo()
	{
		Font f=new Font("Arial",Font.ITALIC,30);
		setFont(f);
		setLayout(null);
		setResizable(false);
		
		b1=new Button("fillArc");
		b1.setFont(f);
		b1.setBackground(Color.pink);
		b1.setSize(150,100);
		b1.setLocation(30,100);
		add(b1);
		
		b2=new Button("fillRect");
		b2.setFont(f);
		b2.setBackground(Color.yellow);
		b2.setSize(150,100);
		b2.setLocation(280,100);
		add(b2);
		
		b3=new Button("fillOval");
		b3.setFont(f);
		b3.setBackground(Color.cyan);
		b3.setSize(150,100);
		b3.setLocation(520,100);
		add(b3);
		
				
		b4=new Button("fillCircle");
		b4.setFont(f);
		b4.setBackground(Color.red);
		b4.setSize(150,100);
		b4.setLocation(750,100);
		add(b4);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}	
	
	public void paint(Graphics g)
	{
		
		if(r1)
		{
			g.setColor(Color.yellow);
			g.fillRect(250,350,500,300);
			
		}
		 
		 if(a1)
		 {
			 g.setColor(Color.pink);
			 g.fillArc(250,350,500,300,0,270);
			
		 }
		
		if(o1)
		{
			g.setColor(Color.cyan);
			g.fillOval(250,350,500,350);
			
		}
		if(s1)
		{
			g.setColor(Color.red);
			g.fillOval(250,350,450,450);
			
		}
	}
	
	public void actionPerformed(ActionEvent e)
	{
         if(e.getSource()==b1)
		 {
			 r1=false;
			 a1=true;
			 o1=false;
			 s1=false;
			 repaint();
		 }
		 
		 if(e.getSource()==b2)
		 {
			 r1=true;
			 a1=false;
			 o1=false;
			 s1=false;
			 repaint();
		 }
		 
		 if(e.getSource()==b3)
		 {
			 r1=false;
			 a1=false;
			 o1=true;
			 s1=false;
			 repaint();
		 }
		 
		  if(e.getSource()==b4)
		 {
			 r1=false;
			 a1=false;
			 o1=false;
			 s1=true;
			 repaint();
		 }
		
	}
		
		
}
class ArcTrRect1
{
	public static void main(String agysd[])
	{
		FDemo f1=new FDemo();
		f1.setVisible(true);
		f1.setSize(1000,800);
		f1.setLocation(200,100);
		
	}	
}		