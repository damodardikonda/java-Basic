import java.io.*;

class StringSwitch{

	public static void main(String[] args) throws IOException{
		
/*		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		switch(s){

			case "damodar":
						System.out.println("Damodar");
						break;

			case "dams":
					    System.out.println("dams");
		    default:
		        System.out.println("xxxxxx");
	
  */          		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer s = new StringBuffer(br.readLine());

		switch(s){

			case "damodar":
						System.out.println("Damodar");
						break;

			case "dams":
					    System.out.println("dams");
		    default:
		        System.out.println("xxxxxx");

		}
	}
}