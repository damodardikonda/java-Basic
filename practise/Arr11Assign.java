//11. Write a program to Delete a number from a given location in an array.

import java.io.*;

class Arr11Assign{

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in));

		System.out.println("Enter Length");
		int len = Integer.parseInt(br.readLine());

		int arr[] = new int[len];

		for (int i = 0 ; i < arr.length ; i++ ) {
			
			arr[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("Enter pos : ");
		int pos = Integer.parseInt(br.readLine());

		
		for (int i = pos; i < arr.length ; i++ ) {
			
			arr[i-1] = arr[i];
		}

		System.out.println("Entered Array After Deleting number is = ");

		for (int i = 0 ; i < arr.length ; i++ ) {
			
			System.out.println(arr[i]);
		}
	}
}	