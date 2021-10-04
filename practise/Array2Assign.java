/*

	@Goal : 2. Write a program to print the position of the smallest & largest number of n numbers using arrays.

*/
import java.io.*;

class Arr2Assign{

	int minMeth(int a[]){

		int m = a[0];
		int pos = 0 ;

		for (int i = 0 ; i < a.length ; i++) {
			
			if(a[i] < m){
				m = a[i];
				pos = i;			}

		}
			pos = pos + 1;
			System.out.println("Position of minimum no is = " + pos);
			return m;
	}

	int maxMeth( int arr[]){

		int m = arr[0];
		int pos = 0 ;
		for (int i = 0 ; i < arr.length ; i++ ) {
			
			if(m < arr[i]){
				m = arr[i];
				pos = i + 1;
			}
		}


			System.out.println("Position of Maximum no is = " + pos);
		return m;
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));

		System.out.print(" Enter Length : ");
		int l = Integer.parseInt(br.readLine());


		int arr[] = new int[l];

		for (int i = 0 ; i < arr.length ; i++ ) {
			
			arr[i] = Integer.parseInt(br.readLine());
		}

		Arr2Assign aa = new Arr2Assign();
		int min = aa.minMeth(arr);
		int max = aa.maxMeth(arr);

		System.out.println(" Minimum Value is = " + min);

		System.out.println(" Maximum Value is = " + max);
	}
}