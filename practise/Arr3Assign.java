

//  @Goal :- 3. Write a program to find the second largest & second smallest of n numbers using an array.


import java.util.*;

class Arr3Assign{

	static int secondSmall( int a[]){

		int s1 = a[0];

		for (int i =0 ; i < a.length ; i++ ) {
			
			if(a[i] < s1)
				s1 = a[i];
		}

		int s2 = a[1];

		System.out.println("s1 value "+s1);

		for (int i = 0 ; i < a.length ; i++) {
			
			if(a[i] != s1){

				if (s2 > a[i])
					s2 =a[i];
			}
		}

		return s2;
	}

	static int secondLarge(int a[]){

		int s1 = a[0];

		for (int i = 0 ; i < a.length ; i++ ) {
			
			if(a[i] > s1){
				s1 = a[i];
			}		
		}

		int s2 = a[0];

		for (int i = 0 ; i < a.length ; i++ ) {
			if(a[i] != s1){
			if(a[i] > s1){
				s1 = a[i];
			}		
		}

	}

	return s2;

	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner( System.in );

		System.out.println("Enter the length");
		int l = sc.nextInt();

		int arr[] = new int[l];

		for (int i = 0 ; i < arr.length ; i++ ) {
			
			arr[i] = sc.nextInt();
		}

		int large = secondLarge(arr);
		int small =	secondSmall(arr);

		System.out.println(" Second Small number is = " + small);

		System.out.println(" Second Large number is = " + large);
	}
}