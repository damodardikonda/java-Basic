//7. Write a program to insert a number at a given location in an array.
import java.util.*;
class Arr7Assign{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner( System.in);

		System.out.println("Enter the Size of array");
		int len = sc.nextInt();

		int arr[] = new int[len+1];

		for (int i = 0 ; i < len-1 ; i++ ) {
			
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter position");
		int pos = sc.nextInt();

		System.out.println("Enter number");
		int n = sc.nextInt();

		for ( int i = (len-1) ; i >= pos ; i-- ) {
			
			arr[i+1] = arr[i];
		}

		arr[pos] = n;

		for (int i = 0 ; i < arr.length ; i++ ) {
			
			System.out.println(arr[i]);
		}
	}
}