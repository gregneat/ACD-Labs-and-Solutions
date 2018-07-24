public class starter {

        public static void main(String args[])
        {
			EasyReader in;
			in = new EasyReader("words.txt");
			int counter = 0;
			while(!in.eof())
			{
				System.out.println(in.readWord());
				counter++;
			}
			System.out.println("there are "+counter+" words.");
		}

}
