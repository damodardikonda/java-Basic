import java.io.*;

class MultiCatch{

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

		try{
			
			System.out.println(br.readLine());
			System.out.println(10/0);
		}
		catch(ArithmeticException ae){
			System.out.println("Divide by 10");
		}catch(IOException e){

			System.out.println("IOException");
		}

	}
}