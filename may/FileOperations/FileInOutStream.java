import java.io.*;

class FileInOutStream{

	public static void main(String[] args) throws IOException , FileNotFoundException{
		
		FileInputStream fin = new FileInputStream("Input.txt");
		FileOutputStream fout = new FileOutputStream("out.txt");

		int size = fin.available();

		for (int i = 0 ; i < size ; i++ ) {
			char x = (char) fin.read();
			fout.write(x);
		}


	}
}