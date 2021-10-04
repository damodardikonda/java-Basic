import java.io.*;

class Angle{

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader( new InputStreamReader (System.in));

		int angle = Integer.parseInt(br.readLine());

		if(angle < 90){

			System.out.println("Acute Angle");
		}

		else if( angle == 90){

			System.out.println("Right Angle");
		}else if (angle > 90 && angle <= 180){

			System.out.println("Obtuse");
		}

        

	}
}