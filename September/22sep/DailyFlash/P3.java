import java.io.*;

class P3{

	public static void main(String[] args) throws IOException {
		
		BufferedReader brOne = new BufferedReader( new InputStreamReader ( System.in));

		BufferedReader brTwo = new BufferedReader( new InputStreamReader ( System.in));

		String name = brOne.readLine();

		String surname = brTwo.readLine();

		System.out.println( name + " " + surname);

		brTwo.close(); 
	}
}