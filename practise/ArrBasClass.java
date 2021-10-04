import java.io.*;

class ArrBasClass{

	void disp(int arr[]){

         for (int i = 0 ; i < arr.length; i++) {
         	
         	System.out.println(arr[i]);
         }
	}
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader (System.in));

		int len = Integer.parseInt(br.readLine());

		int arr[] = new int[len];

		for (int i = 0 ; i < arr.length ; i++ ) {
			
			 arr[i] = Integer.parseInt(br.readLine());
		}

		ArrBasClass abc = new ArrBasClass();
		abc.disp(arr);
	}
}