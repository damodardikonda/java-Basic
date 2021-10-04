import java.io.*;

class Month{

	public static void main(String[] args) {
		int month = 0;
		try{
		BufferedReader br = new BufferedReader( new InputStreamReader (System.in));
		 month = Integer.parseInt(br.readLine());
        }
        catch(IOException e){

        	System.out.println("Gand Lagli");
        }
		switch(month){

			case 1 :

				 System.out.println("january");
				 break;

			case 2 :

				 System.out.println("feb");
				 break;

			case 3 :

				 System.out.println("march");
				 break;

			case 4 :

				 System.out.println("April");
				 break;

			case 5 :

				 System.out.println("may");
				 break;

			case 6:

				 System.out.println("june");
				 break;

			default:

			     System.out.println("Default");
			     break;

			 case 7 :

				 System.out.println("jully");
				 break;

			case 8 :

				 System.out.println("August");
				 break;

			case 9 :

				 System.out.println("Sept");
				 break;

			
			
		}
	}
}