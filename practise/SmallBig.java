import java.io.*;

class SmallBig{

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader ( System.in ) );
		int n = Integer.parseInt( br.readLine() );

		System.out.println("Enter array elements");

		int a[] = new int[n];

		for (int i = 0 ; i < a.length ; i++ ) {
			
			a[i] = Integer.parseInt(br.readLine());	
		}

		int small = a[0];
		int big = a[0];

		for (int i = 0 ; i < a.length ; i++ ) {
			
			if(a[i] > big)
				big = a[i];
			else if(a[i] < small)
				small = a[i];
		}

		System.out.println("Smallest Elements is = " + small);
		System.out.println("Largest Element is = " + big);

	}
}