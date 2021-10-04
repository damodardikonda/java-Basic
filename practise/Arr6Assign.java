//6. Insertion operation on Array: Insertion in the Middle.

import java.io.*;

class Arr6Assign{

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader( new InputStreamReader (System.in));

		System.out.println("Enter the length");

		int len = Integer.parseInt(br.readLine());

		int mid = (len+ 1)/2-1;

		int a[]  = new int[len+1];

		for (int i = 0 ; i <  len ; i++ ) {
			
			a[i] = Integer.parseInt(br.readLine());
		}

		for (int i = (len-1) ; i >= mid  ; i-- ) {
			
			a[i+1] = a[i];
		}

		a[mid] = 50;


		System.out.println("Array is = " );
		for (int i = 0 ; i < a.length ; i++ ) {
			
			System.out.println(a[i]);
		}
	}
}