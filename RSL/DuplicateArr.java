import java.io.*;

class DuplicateArray{

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		int flag = 0 , pos = 0 , val = 0;
		System.out.println(" Enter length of array = ");

		int len = Integer.parseInt(br.readLine());

		int a[] = new int[len];

		for (int i = 0 ; i < a.length ; i++ ) {
			
			a[i] = Integer.parseInt(br.readLine());	
		}

		for (int i = 0 ; i < a.length ; i++ ) {
			
			for (int  j = 0 ; j < a.length ; j++ ) {
				
				if( ( a[i] == a[j] ) && i != j){
					flag = 1 ;
					pos = i;
					val = a[i];
				}
			}
		}

		if(flag == 1){

			System.out.println(" Duplicate value found at " + pos + " value is " + val);

		}
	}
}