import java.io.*;

class Year{
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        System.out.println("Enter the Year");
		int y = Integer.parseInt(br.readLine()); 
        
        if(y % 4 == 0){

        	System.out.println(" Leap Year");
        }
        else
        	System.out.println(" Not a Leap Year");
	}
}





