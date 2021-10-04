import java.io.*;

class P3{

    public static void main(String[] args) throws IOException{
    	
    	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
       
       
    	int[] arr = new int[5];

    	for (int i = 0 ; i < 5  ; i++ ) {
    		
    		System.out.print("Enter number");
    		arr[i] = Integer.parseInt(br.readLine());
           
    	}

 
         int temp = arr[0];

         for (int i =  1; i < arr.length ; i++ ) {
             
             if(arr[i] > temp){

                temp = arr[i];
             }
         }


         System.out.println(" Greater Numbwer is = " + temp );

}
    }