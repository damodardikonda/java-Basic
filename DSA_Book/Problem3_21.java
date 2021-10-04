/*
Suppose you are given an array, A, containing 100 integers that were generated
using the method r.nextInt(10), where r is an object of type java.util.Random.
Let x denote the product of the integers in A. There is a single number that x will
equal with probability at least 0.99. What is that number and what is a formula
describing the probability that x is equal to that number?

*/

import java.util.*;

class Problem3_21{

	public static void main(String[] args) {
		
		Random r = new Random();
		int arr[] = new int[100];
		for (int i = 0 ; i < arr.length ; i++ ) {
			arr[i] = r.nextInt(10);
		}
		boolean b = False;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		 for(int i = 0 ; i < arr.length ; i++){
			 if(num == arr[i]){
		 		b = true;
		 		break;}
		 	
		 		
		}

		if(b == true)
			System.out.println("Found");
		else
			System.out.println(" Not Found");
	}
}