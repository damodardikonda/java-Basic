/*
	
	@Goal : 1. Write a program to read and display n numbers using an array. (Traversing of an array)

	@Author : Damodar

	@version : 0.1

	@Date : 16march

*/

import java.io.*;

class ArrBasic{

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader ( System.in ));

        System.out.println("Enter the length of array");
        int len = Integer.parseInt(br.readLine());

		int arr[] = new int[len];

		for (int i = 0 ; i < arr.length ; i++ ) {
					
			arr[i] = Integer.parseInt(br.readLine());

		}	


        System.out.println("Array Elements are = ");

		for (int i = 0 ; i < arr.length ; i++ ) {
				int pos = i+1;
				System.out.println( "element in " +  pos  + " position is "+arr[i]);
			}	
	}
}