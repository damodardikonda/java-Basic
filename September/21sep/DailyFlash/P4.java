import java.io.*;

class P4{
	
	public static void main(String[] args) throws IOException{

      BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        System.out.println("Enter three Number");

		int x = Integer.parseInt(br.readLine()); 		

		int z = Integer.parseInt(br.readLine()); 		

		int y = Integer.parseInt(br.readLine()); 		

      
        if((x > y ) && (x > z)){

        	System.out.println(x + " is greater ");
        }
        else if ( y > x && y > z)
        	System.out.println( y + " is greater");
        else
           System.out.println(z + " is greater ");
        	

	}
}