import java.util.*;
import java.io.*;

class PropertiesDemo{

	public static void main(String[] args) throws IOException , FileNotFoundException{
		
		Properties p = new Properties();
		System.out.println(p);

		FileInputStream fis = new FileInputStream("abc.properties");

		p.load(fis);

		System.out.println(p);

		p.setProperty("J" , "10000");

		FileOutputStream f = new FileOutputStream("abc.properties");
		p.store(f , "By Damodar ");

		
	}
}
