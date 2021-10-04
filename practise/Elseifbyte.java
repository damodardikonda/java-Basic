import java.io.*;

class ByteDemo{

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader ( System.in) );

		byte b1 = Byte.parseByte(br.readLine());

		if(b1 == 1){

			System.out.println("1");
		}else if( b1 == 2){

			System.out.println("2");
		}else if( b1 == 3){
			System.out.println("3");
		} else {

			System.out.println("4");
		}
	}
}