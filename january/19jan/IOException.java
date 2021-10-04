import java.io.*;

class IOExceptionDemo{

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader( new InputStreamReader ( System.in));

		int a = Integer.parseInt( br.readLine());
	}
}