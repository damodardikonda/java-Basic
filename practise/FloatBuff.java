import java.io.*;

class FloatBuff{

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader ( new InputStreamReader(System.in ));
	
		float f = Float.parseFloat(br.read());

		System.out.println(f);
	}
}