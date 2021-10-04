import java.io.*;

class P1{

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);

		BufferedReader br = new BufferedReader(isr);

		int  isrRead = isr.read();
		
		br.skip(1);
		
		int brRead = br.read();

		System.out.println(isrRead == brRead); 
		 
	}
}