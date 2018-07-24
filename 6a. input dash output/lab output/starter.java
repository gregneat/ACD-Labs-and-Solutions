import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.*;

public class starter 
{
	public static void main(String[] args) {
		
		EasyReader r_in = new EasyReader();
		
		System.out.println("Please enter Window width");
		int width = r_in.readInt();
		System.out.println("Please enter a Window title");
		String cheese = r_in.readLine();
		
		
		Butt afuke = new Butt(cheese,width,width);
	}
}


