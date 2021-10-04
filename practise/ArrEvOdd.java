import java.io.*;
class ArrEvOdd{

	public static void main(String[] args) {
		
		int a[] = new int[5];

		try{

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			for (int i = 0 ; i < a.length ; i++ ) {
				
				a[i] = Integer.parseInt(br.readLine());
			}

		} catch(IOException ie){}

		for (int i = 0 ; i < a.length ; i++ ) {
			
			System.out.println(a[i]);
		}
		int j = 0 , k = 0;

		int even_a[] = new int[5];
		int odd_a[] = new int[5];
		for (int i = 0 ; i < a.length ; i++ ) {
			
			if(a[i] %2 == 0){

				
					
				
				        even_a[j]  =a[i];
				j++;
			}

			else{

		 
					
					odd_a[k] = a[i];
				k++;
			}
		}

		System.out.println("Array for even numbers are = " );

		for (int i = 0; i < even_a.length ; i++) {
			
			System.out.println(even_a[i]);
		}


		System.out.println("Array for odd numbers are = " );

		for (int i = 0; i < odd_a.length ; i++) {
			
			System.out.println(odd_a[i]);
		}
	}
}