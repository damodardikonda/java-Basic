// read a data from keyboard
import java.io.*;
class ReadKeyboard{

	public static void main(String[] args) throws IOException  {
		
		InputStreamReader fin = new InputStreamReader(System.in);

		System.out.println(" Enter q to exit ");
		char c ;
		do{
			c = (char) fin.read();
			System.out.print(c);
		}while(c != 'q');

		fin.close();
	}
}