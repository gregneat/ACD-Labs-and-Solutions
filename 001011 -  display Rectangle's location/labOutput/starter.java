public class starter {

        public static void main(String args[])
        {
			
			int counter = 0;
			EasyReader in;
			int td;
			int d = 1;
			in = new EasyReader();
			Rectangle box = new Rectangle(5,10,60,100);
			box.setColor(Color.BLUE);
			box.fill();
			Text name = new Text(20,50,"Neato");
			name.draw(); 
			Text loc = new Text(20,70,box.getX()+", "+box.getY());
			loc.draw();
		}

}
