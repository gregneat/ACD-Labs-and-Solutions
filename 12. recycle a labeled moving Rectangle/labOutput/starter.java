public class starter {

        public static void main(String args[])
        {
			
			int counter = 0;
			int td;
			int d = 1;
			int xStart = 5;
			int yStart = 10;
			Rectangle box = new Rectangle(xStart,yStart,60,100);
			box.setColor(Color.BLUE);
			box.fill();
			Text name = new Text(20,50,"Neato");
			name.draw(); 
			Text loc = new Text(20,70,box.getX()+", "+box.getY());
			loc.draw();
			td = 10000/2;
			while(true)
			{
				int locDx = xStart-box.getX();
				int locDy = yStart - box.getY();
				Canvas.pause(td);
				box.translate(d,0);
				name.translate(d,0);
				loc.translate(d,0);
				loc.setText(box.getX()+", "+box.getY());
				if(box.getX() > 570)
				{
					box.translate(locDx,0);
					name.translate(locDx,0);
					loc.translate(locDx,0);
					loc.setText(box.getX()+", "+box.getY());
				}
			}
		}

}
