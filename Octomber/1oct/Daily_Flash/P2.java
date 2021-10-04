import java.io.*;

class P2{

    public static void main(String[] args) throws IOException{
    	
    	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
       
       int sum = 0 ;
    	int[] arr = new int[5];

    	for (int i = 0 ; i < 5  ; i++ ) {
    		
    		System.out.print("Enter number");
    		arr[i] = Integer.parseInt(br.readLine());
           sum = sum + arr[i];
    	}


    	System.out.println("The Sum is " + sum);


}
    }