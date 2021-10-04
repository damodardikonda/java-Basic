import java.io.*;
class NumArr{

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader (System.in));

		System.out.println("Enter the Length of array = ");
		int len = Integer.parseInt(br.readLine());

		int arr[] = new int[len]; 
		int num = 0;rr
		for (int i = 0 ; i < arr.length ; i++ ) {
			
			arr[i] = Integer.parseInt(br.readLine()); 
			num = num * 10 + arr[i];	
		 } 

		 for (int i = 0 ; i < arr.length ; i++ ) {
		 	
		 	System.out.println(arr[i]);
		 }
		 System.out.println(num);
	}
}