public class starter {

        public static void main(String args[])
        {
			Car[] traffic = new Car[100];
			for(int i = 0; i<traffic.length;i++)
			{
				int r = (int)(Math.random()*255);
				int g = (int)(Math.random()*255);
				int b = (int)(Math.random()*255);
				Color temp = new Color(r,g,b);
				int sp = (int)(Math.random()*10);
				int xStart = 5;
				int yStart = (int)(Math.random()*500);
				String en = "car";
				traffic[i] = new Car(xStart,yStart,en+i,temp,sp);
			}
			int td;
			td = 7500;
			while(true)
			{
				for(int j=0; j<traffic.length;j++)
				{
					traffic[j].translate(traffic[j].getSpeed(),0);
					if(traffic[j].getX() > 570)
					{
						traffic[j].translate(-570,0);
					}
				}	
				Canvas.pause(td);
			}
		}

}
