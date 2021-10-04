//8. Deletion operation on Array: Deletion at the end.

import java.io.*;

class Arr8Assign{

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

		int l = Integer.parseInt(br.readLine());

		int arr[] = new int[l];

		for (int i = 0 ; i < arr.length ; i++ ) {
			
			arr[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("Deleting at end ");
		arr[arr.length-1]=0;

		for (int i = 0 ; i < arr.length-1 ; i++) {
			
			System.out.println(arr[i]);
		}
	}
}