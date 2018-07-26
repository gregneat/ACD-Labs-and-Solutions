public class starter {

        public static void main(String args[])
        {
			String magic = "";
			EasyReader in;
			in = new EasyReader("words.txt");
			int counter = 0;
			int c2;
			while(!in.eof())
			{
				System.out.println(in.readWord());
				counter++;
			}
			in.close();
			in = new EasyReader("words.txt");
			System.out.println("there are "+counter+" words.");
			c2 = (int)(Math.random()*counter)+1;
			System.out.println("the magic number is: "+c2);
			counter = 0;
			while(counter < c2)
			{
				magic = in.readWord();
				counter++;
			}
			System.out.println(magic);
		}

}
