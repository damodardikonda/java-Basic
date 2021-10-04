import java.io.*;
class IODemo{

	public static void main(String[] args) throws IOException {
		
		System.out.println("Try-catch started");

		BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));
		br.close();
		try{

			System.out.println(br.readLine());
		}catch(IOException io){

			System.out.println("IoException is handled");
		}

		System.out.println(" Exception over");
	}
}