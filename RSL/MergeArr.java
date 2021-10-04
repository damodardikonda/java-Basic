import java.io.*;

class MergeArr{

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader( new InputStreamReader ( System.in ));

		System.out.println("Enter length of array 1");
		int l =  Integer.parseInt(br.readLine());

		System.out.println("Enter length of array 2");
		int m =  Integer.parseInt(br.readLine());

		int n = l + m;

		int a1[] = new int[l];
		int a2[] = new int[m];
		int a3[] = new int[n];


		for (int i = 0 ; i < l ; i++ ) {
			
			a1[i] = Integer.parseInt(br.readLine()); 
		}


		for (int i = 0 ; i < m ; i++ ) {
			
			a2[i] = Integer.parseInt(br.readLine()); 
		}


		for (int i = 0 ; i < l ; i++ ) {
			
			a3[i] = a1[i]; 
		}
int x = l;
		for (int i = 0 ; i < m ; ) {
			
			a3[x] = a2[i];
			x++;
		}

		System.out.println(" Merged Array is =  ");
		for (int i = 0 ; i < n ; i++ ) {
			
			System.out.println(a3[i]);
		}

	}
}