public class starter {

        public static void main(String args[])
        {
			System.out.print("Please enter your favorite word: ");
			EasyReader in;
			in = new EasyReader();
			String w = in.readLine();
			int wLen = w.length();
			// System.out.println(wLen);
			int counter = 0;
	
			// this is just to get the spacing correct
			// first try - String test = w.substring(0,1);
			// String test = w.substring(0,1);
			// Text trail = new Text(-10,box.getY()+box.getWidth()/2,test);
			for(int i = 0; i < w.length(); i++)
			{
				String s = w.substring(i, i+1);
				Text t = new Text(5,counter*10,s);
				System.out.println(s + " " + t.getWidth());
			}
				
		}

}
