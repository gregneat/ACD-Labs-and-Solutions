public class starter {

        public static void main(String args[])
        {
			int td;
			int d = 1;
			// first box
			int xStart1 = 5;
			int yStart1 = 10;
			Rectangle box1 = new Rectangle(xStart1,yStart1,60,100);
			box1.setColor(Color.BLUE);
			box1.fill();
			Text name1 = new Text(20,50,"Neato");
			name1.draw(); 
			Text loc1 = new Text(20,70,box1.getX()+", "+box1.getY());
			loc1.draw();
			// second box
			int xStart2 = 220;
			int yStart2 = 200;
			Rectangle box2 = new Rectangle(xStart2,yStart2,60,100);
			box2.setColor(Color.RED);
			box2.fill();
			Text name2 = new Text(xStart2+15,yStart2+40,"Trump");
			name2.draw(); 
			Text loc2 = new Text(xStart2+10,yStart2+60,box2.getX()+", "+box2.getY());
			loc2.draw();
			// third box
			int xStart3 = 420;
			int yStart3 = 500;
			Rectangle box3 = new Rectangle(xStart3,yStart3,60,100);
			box3.setColor(Color.YELLOW);
			box3.fill();
			Text name3 = new Text(xStart3+15,yStart3+40,"Mickey");
			name3.draw(); 
			Text loc3 = new Text(xStart3+10,yStart3+60,box3.getX()+", "+box3.getY());
			loc3.draw();
			td = 10000/2;
			while(true)
			{
				// box 1
				int locDx1 = xStart1-box1.getX();
				int locDy1 = yStart1 - box1.getY();
				Canvas.pause(td);
				box1.translate(d,0);
				name1.translate(d,0);
				loc1.translate(d,0);
				loc1.setText(box1.getX()+", "+box1.getY());
				if(box1.getX() > 570)
				{
					box1.translate(locDx1,0);
					name1.translate(locDx1,0);
					loc1.translate(locDx1,0);
					loc1.setText(box1.getX()+", "+box1.getY());
				}
				// box 2
				int locDx2 = xStart1-box2.getX();
				int locDy2 = yStart1 - box2.getY();
				//Canvas.pause(td);
				box2.translate(d*2,0);
				name2.translate(d*2,0);
				loc2.translate(d*2,0);
				loc2.setText(box2.getX()+", "+box2.getY());
				if(box2.getX() > 570)
				{
					box2.translate(locDx2,0);
					name2.translate(locDx2,0);
					loc2.translate(locDx2,0);
					loc2.setText(box2.getX()+", "+box2.getY());
				}
				// box3
				int locDx3 = xStart1-box3.getX();
				int locDy3 = yStart1 - box3.getY();
				box3.translate(d*2.5,0);
				name3.translate(d*2.5,0);
				loc3.translate(d*2.5,0);
				loc3.setText(box3.getX()+", "+box3.getY());
				if(box3.getX() > 570)
				{
					box3.translate(locDx3,0);
					name3.translate(locDx3,0);
					loc3.translate(locDx3,0);
					loc3.setText(box3.getX()+", "+box3.getY());
				}
			}
		}

}
