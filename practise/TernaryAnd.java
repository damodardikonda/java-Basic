
import java.io.*;

class TernaryAnd{

	public static void main(String[] args) {
		
		int num = 0;

        try{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		 num = Integer.parseInt(br.readLine());
	} catch (IOException e){}

	System.out.println((num%5 == 0 && num % 7 == 0) ? "Divisible by 5 and 7 " : "Divisible by only 5 or 7");
}
}