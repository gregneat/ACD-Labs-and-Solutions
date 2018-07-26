public class starter implements InputControl {
	
	private static Car[] traffic;
	
	public static void main(String args[])
        {
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			// put your code here:
			
			traffic = new Car[5];
			int yStart = 0;
			for(int i=0; i<traffic.length;i++)
			{
				int r = (int)(Math.random()*255);
				int g = (int)(Math.random()*255);
				int b = (int)(Math.random()*255);
				Color temp = new Color(r,g,b);
				String s = "car ";
				// make all cars go speed 1 to check average calc
				int sp = (int)(Math.random()*5)+1;
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
				for(int j =0; j< traffic.length; j++)
				{
					traffic[j].translate(traffic[j].getSpeed(),0);
					if(traffic[j].getX() > 570)
					{
						traffic[j].translate(-570,0);
					}
				}
				Canvas.pause(10000);
			}	
		}

		public void onMouseClick(double x, double y){
			System.out.print("click ");
			//System.out.println("x is: " + x + "y is: " + y);
			for(int i = 0; i<traffic.length;i++)
			{
				if(traffic[i].contains(x,y))
				{				
					traffic[i].changeSpeed(0);
					System.out.print(traffic[i].getName() + " " +traffic[i].getSpeed());
				}
				System.out.println();
			}
		}
}
