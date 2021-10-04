
/*


R-3.14 Give three different examples of a single Java statement that assigns variable,
backup, to a new array with copies of all int entries of an existing array, original.

*/

import java.util.*;

class Problem14{

	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,4,5,6};
		
		System.out.println("---------- Way 1 ---------");
		int arr2[] = new int[arr1.length];
		arr2 = arr1;
		for (int i = 0 ; i < arr2.length ; i++ ) 		
			System.out.println(arr2[i]);

//-----------------------------------------------------------------------

		System.out.println("--------- Way 2 --------");
		int arr3 [] = arr1.clone();
		for (int i = 0 ; i < arr3.length ; i++ ) {
			
			System.out.println(arr3[i]);
		}

//-----------------------------------------------------------------------

		System.out.println("----------Way 3 --------");
		int arr4[] = Arrays.copyOf(arr1 , arr1.length);
		for (int i = 0 ; i < arr4.length ; i++ ) {
			
			System.out.println(arr4[i]);
		}
	}
}