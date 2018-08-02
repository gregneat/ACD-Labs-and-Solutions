public class starter implements InputControl {
	
	private static Vehicle what;
	
	public static void main(String args[])
        {
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			int r = (int)(Math.random()*255);
			int g = (int)(Math.random()*255);
			int b = (int)(Math.random()*255);
			Color temp = new Color(r,g,b);
			what = new Truck(30,30,"neato",temp,23);
			
			while(true)
			{
				what.translate(what.getSpeed(),0);
				if(what.getX() > 570)
				{
					what.translate(-570,0);
				}
				Canvas.pause(10000);
			}	
		}

		public void onMouseClick(double x, double y)
		{
			if(what.contains(x,y))
			{				
				what.changeSpeed(0);
			}
		}
}
