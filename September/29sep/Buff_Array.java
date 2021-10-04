import java.io.*;

class Buff_Array{
	
	public static void main(String[] args) throws IOException{
      
         BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

         System.out.println("Enter the Size of Array");

         int x = Integer.parseInt( br.readLine());

         int arr[] = new int[x];

         for (int i = 0 ; i < arr.length ; i++) {
         	
         	System.out.print("Enter Array numbers  =  ");
         	arr[i] = Integer.parseInt(br.readLine());

         }

          System.out.println(" Entered Array Numbers are");
         for (int i = 0 ; i < x ; i++ ) {
         	
         	System.out.println(arr[i]); 
         }

 

	}
}