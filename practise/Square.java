
import java.io.*;
class Squarejava{

	public static void fun(int a){

		for (int i = 0 ; i <= a*a ; i++ ) {
			
			if(i%a==0){

				System.out.println("* ");
			}

			else{

				System.out.print("* ");
			}

		
		}
	}

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader( new InputStreamReader (System.in));
	     int num = Integer.parseInt(br.readLine());

	     if(num > 0 ){

	     	fun(num);
	     }
	}
}