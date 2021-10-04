/*

		R-3.13 What is the difference between a shallow equality test and a deep equality test
		between two Java arrays, A and B, if they are one-dimensional arrays of type int?
		What if the arrays are two-dimensional arrays of type int?


	Answer :--

		Shallow Copy :- 

				Shallow check only if the referenced objects are same. That is they are 
				pointing to the same memory location.

		Deep Copy :-

				Deep copy is checking each and every value of that object with some other object


*/

import java.util.*;

class Shallow_Deep{

	public static void main(String[] args) {
		
		System.out.println(" Shallow Copy ----------------- ");
		int arr1[] = new int[5];
		for(int i = 0 ; i < arr1.length;i++){
			arr1[i] = i ;
		}
		int arr2[] = new int[arr1.length];

		 for (int i = 0 ; i < arr2.length ; i++) {
		 	
		 	arr2[i] = arr1[i];
		 }

		 System.out.println(" Shallow copy arr1 is ");
		 for (int i = 0  ; i < arr1.length ; i++ ) {
		 	
		 	System.out.println(arr1[i]);
		 }

		System.out.println(" Shallow copy arr2 is ");
		 for (int i = 0  ; i < arr2.length ; i++ ) {
		 	
		 	System.out.println(arr2[i]);
		 }		 

		 System.out.println(" if we change value of 2nd index from arr1 then it will not effect on arr2 ");
		 arr1[1] = 100;

		 System.out.println(" arr1 from shallow is ");
		 for (int i = 0 ; i < arr1.length ; i++) {
		 	
		 	System.out.println(arr1[i]);
		 }
		 System.out.println(" arr2 from shallow is");
		 for (int i =0 ; i < arr2.length ; i++ ) {
		 	
		 	System.out.println(arr2[i]);

		 }

		 //--------------------------------------------------------------------------------------

		 System.out.println("--------------------------------------------------------------------------------");

		 System.out.println(" Deep Copy");

		 int arr3[] = new int[5];
		 int arr4[] = new int[arr3.length];

		 for (int i = 0 ; i < arr3.length ; i++ ) {
		 	
		 	arr3[i] = i;
		 }

		 arr4 = arr3;

		 System.out.println(" Deep Copy array1 ");
		 for (int i = 0 ; i < arr3.length ; i++ ) {
		 	
		 		System.out.println(arr3[i]);
		 }

		System.out.println(" Deep Copy array2 ");
		 for (int i = 0 ; i < arr4.length ; i++ ) {
		 	
		 		System.out.println(arr4[i]);
		 }		 

		 System.out.println(" in Deep copy if we change value of 2nd index from ar1 then it will not effect on arr2 ");
		 arr3[1] = 100;

		 System.out.println(" arr1 from deep copy is ");
		 for (int i = 0 ; i < arr3.length ; i++) {
		 	
		 	System.out.println(arr3[i]);
		 }
		 System.out.println(" arr2 from deep copy is");
		 for (int i =0 ; i < arr4.length ; i++ ) {
		 	
		 	System.out.println(arr4[i]);

		 }
	}
}