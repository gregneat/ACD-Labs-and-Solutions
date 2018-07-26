public class starter {

        public static void main(String args[])
        {
			int td;
			int d = 1;
			int xStart1 = 5;
			int yStart1 = 10;
			Car volvo = new Car(xStart1,yStart1);
			// box1.setColor(Color.BLUE);
			// box1.fill();
			// Text name1 = new Text(20,50,"Neato");
			// name1.draw(); 
			// Text loc1 = new Text(20,70,box1.getX()+", "+box1.getY());
			// loc1.draw();
			td = 10000/2;
			while(true)
			{
				int locDx1 = xStart1-volvo.getX();
				// int locDy1 = yStart1 - box1.getY();
				Canvas.pause(td);
				// box1.translate(d,0);
				// name1.translate(d,0);
				volvo.translate(d,0);
				// name1.translate(d,0);
				// loc1.translate(d,0);
				// loc1.setText(box1.getX()+", "+box1.getY());
				if(volvo.getX() > 570)
				{
					volvo.translate(locDx1,0);
					// name1.translate(locDx1,0);
					// loc1.translate(locDx1,0);
					// loc1.setText(box1.getX()+", "+box1.getY());
				}
			}
		}

}
