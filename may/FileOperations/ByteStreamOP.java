import java.io.*;

class ByteStreamINOUT{

	public static void main(String[] args) throws FileNotFoundException , IOException{
		
		FileInputStream fin = new FileInputStream("Input.txt");
		FileOutputStream fout = new FileOutputStream("output.txt");
		int c = 0;
		while ((c = fin.read() ) != -1 )
			fout.write(c);
		int x = 10;
		fin.close();
		fout.close();
	}
}