public class starter implements InputControl {

	static Rectangle box;

	public static void main(String args[])
        {
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			// put your code here:
			
			box = new Rectangle(5,10,60,80);
			box.draw();
		}


		public void onMouseClick(double x, double y){
			box.translate(10,0);
		}
}
