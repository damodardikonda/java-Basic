import java.io.*;

class ArrayPos{

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

		System.out.println("Enter Size of Array");
		int n = Integer.parseInt(br.readLine());

		int a[] = new int[n+1];


		for ( int i = 0 ; i < n ; i++ ) {
      			
      			System.out.println("Enter " + i + " Position Value");
      			a[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("Entered Array is " );

		for (int i = 0 ; i < n ; i++ ) {
			
			System.out.println(a[i]);
		}

		System.out.println("Enter number which you want to enter ");
		int x = Integer.parseInt(br.readLine());

		System.out.println("Enter position ");
		int pos = Integer.parseInt(br.readLine());

        for (int i = (n-1) ; i >= (pos-1) ; i-- ) {
        	
        	a[i+1] = a[i];
        }

        a[pos-1] = x;

		for (int i = 0 ; i < a.length ; i++ ) {
			
			System.out.println(a[i]);
		}

		System.out.println(" Value of n is ="+n);
		System.out.println(" Value of length is ="+a.length);
		

	}
}