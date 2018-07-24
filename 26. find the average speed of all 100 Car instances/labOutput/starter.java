public class starter {

        public static void main(String args[])
        {
			Car[] traffic = new Car[5];
			int yStart = 0;
			for(int i=0; i<traffic.length;i++)
			{
				int r = (int)(Math.random()*255);
				int g = (int)(Math.random()*255);
				int b = (int)(Math.random()*255);
				Color temp = new Color(r,g,b);
				String s = "car ";
				// make all cars go speed 1 to check average calc
				int sp = 1;
				int xStart = 5;
				while(yStart%Car.CARHEIGHT != 0)
				{
					yStart++;
				}
				traffic[i] = new Car(xStart,yStart, s+i,temp,sp);
				yStart++;
			}
			/* for(int m=0; m <traffic.length; m++)
			{
				System.out.println(traffic[m].getName() + " " + traffic[m].getSpeed());
			} */
			System.out.println("The average car speed is: " + findAvg(traffic));
			//System.out.println(findMaxSpeed(traffic).getName());
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
		public static Car findMaxSpeed(Car[] LA)
		{
			int m = 0;
			int k = 0;
			int index = -1;
			for(k=0; k < LA.length; k++)
			{
				if(LA[k].getSpeed() > m)
				{
					m = LA[k].getSpeed();
					index = k;
				}
			}
			return LA[index];
		}
		public static double findAvg(Car[] port)
		{
			double a = 0.0;
			double sum = 0.0;
			for(int i = 0; i < port.length; i++)
			{
				sum = sum + port[i].getSpeed();
			}
			a = sum/port.length;
			return a;
		}

}
