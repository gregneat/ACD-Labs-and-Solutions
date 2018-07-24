public class starter {

        public static void main(String args[])
        {
			
			int counter = 0;
			EasyReader in;
			int td;
			in = new EasyReader();
			Rectangle box = new Rectangle(5,10,60,100);
			box.setColor(Color.BLUE);
			box.fill();
			Text name = new Text(20,50,"Neato");
			name.draw();
			System.out.print("Please enter time delay: ");
			td = in.readInt();
			while(true)
			{
				Canvas.pause(td);
				box.translate(10,0);
				name.translate(10,0);
			}
		}

}
