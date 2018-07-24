import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

public class Butt extends JFrame
{
	public Butt(String a)
	{
		super(a);
		setVisible(true);
		setSize(500,500);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public Butt(String a, int num1, int num2)
	{
		this(a);
		setSize(num1,num2);
	}
	
	public Butt(String a,Color blah,int es1, int es2)
	{
		this(a, es1, es2);
		getContentPane().setBackground(blah);
		repaint();
	}
}

