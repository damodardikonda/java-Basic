import java.io.*;

class P1{

    public static void main(String[] args) throws IOException{
    	
    	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

    	int[] arr = new int[5];

    	for (int i = 0 ; i < 5  ; i++ ) {
    		
    		System.out.print("Enter number");
    		arr[i] = Integer.parseInt(br.readLine());

    	}
    	for (int i = arr.length - 1 ; i >= 0 ; i-- ) {
    		
    		System.out.println(arr[i]);
    	}

    }

}