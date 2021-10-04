import java.io.*;
class CharOP{

	public static void main(String[] args) throws IOException , FileNotFoundException {
		
		FileReader fin = new FileReader("input.txt");
		FileWriter fout = new FileWriter("output2.txt");

		int c = 0 ;

		while(( c = fin.read()) != -1)
					fout.write(c);	
		
	
		fin.close();
		fout.close();
	}
}