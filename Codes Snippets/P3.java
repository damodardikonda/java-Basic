import java.io.*;
class P3{

	public static void main(String[] args) throws IOException{
		
		 BufferedReader br = new BufferedReader( new InputStreamReader (System.in));

		 float f = Float.parseFloat( br.readLine());

		 if(f == 1.1f){

		 	System.out.println(true);
		 }else{

		 	System.out.println(false);
		 }


		 int a = Integer.parseInt( br.readLine());

		 if(a == 1){

		 	System.out.println(true);
		 }else{

		 	System.out.println(false);
		 }


		   double d = Double.parseDouble( br.readLine());

		 if(d == 1.1){

		 	System.out.println(true);
		 }else{

		 	System.out.println(false);
		 }
	}
}