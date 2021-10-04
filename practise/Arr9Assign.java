//9.  Deletion operation on Array: Deletion at the Start
import java.io.*;
class Arr9Assign{

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

		int l =  Integer.parseInt(br.readLine());

		int a[] = new int[l];

		for ( int  i = 0 ; i < a.length ; i++ ) {
			
			a[i] = Integer.parseInt(br.readLine());
		}

		for (int i = 1; i < a.length; i++ ) {
			
			a[i-1] = a[i];
		}

		System.out.println("After deleting Starting index");

		for (int i = 0 ; i < a.length-1 ; i++ ) {
			
			System.out.println(a[i]);
		}
	}
}