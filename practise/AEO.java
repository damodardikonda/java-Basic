import java.io.*;
class AEO{

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

		int even_a[] = new int[5];
		int odd_a[] = new int[5];
		for (int i = 0 ; i < a.length ; i++ ) {
			
			if(a[i] %2 == 0){

					System.out.println(a[i] + " is Even num");
				}

			else{

									
					System.out.println(a[i] + " odd no");
				
}			}

		}
}