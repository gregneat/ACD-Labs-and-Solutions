public class starter {

        public static void main(String args[])
        {
			Car[] traffic = new Car[100];
			int yStart = 0;
			for(int i=0; i<traffic.length;i++)
			{
				int r = (int)(Math.random()*255);
				int g = (int)(Math.random()*255);
				int b = (int)(Math.random()*255);
				Color temp = new Color(r,g,b);
				String s = "car ";
				int sp = (int)(Math.random()*10);
				int xStart = 5;
				while(yStart%Car.CARHEIGHT != 0)
				{
					yStart++;
				}
				traffic[i] = new Car(xStart,yStart, s+i,temp,sp);
				yStart++;
			}
			while(true)
			{
				Canvas.pause(7500);
				
				for(int j =0; j< traffic.length; j++)
				{
					traffic[j].translate(traffic[j].getSpeed(),0);
					if(traffic[j].getX() > 570)
					{
						traffic[j].translate(-570,0);
					}
				}
			}
			
		}

}
