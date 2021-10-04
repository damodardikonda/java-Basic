import java.io.*;

class FileNotDemo{

	public static void main(String[] args) throws FileNotFoundException{
		
		File f = new File("abc.txt");
		FileInputStream fis = new FileInputStream(f);
	}
}