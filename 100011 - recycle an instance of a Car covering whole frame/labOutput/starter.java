public class starter {

        public static void main(String args[])
        {
			int td;
			int d = 5;
			int xStart = 5;
			int yStart = 10;
			Car volvo = new Car(xStart,yStart,"Tesla");
			td = 7500;
			while(true)
			{
				Canvas.pause(td);
				if(volvo.getX() > 570)
				{
					
					if(volvo.getY() > 500)
					{
						volvo.translate(-570,-500);
					}
					else
					{
						volvo.translate(-570,volvo.getHeight());
					}	
				}
				else
				{
					volvo.translate(d,0);
				}
			}
		}

}
