/*

	3.2 Write a Java method that repeatedly selects and removes a random entry from an
        array until the array holds no more entries.

*/

import java.util.Random;
import java.io.*;

class Random_Remove{
	void remove_meth(int inp[]){

			for(int i = 0 ; i < inp.length-1 ; i++){

				inp[i] = -1;
			}

			if(inp[0] == -1)
				System.out.println(" All element deleted ");
			else
				System.out.println(" All element is not deleted n");
	}
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println(" Enter the size :- ");
		int size = Integer.parseInt(br.readLine());

		int inp[] = new int[size];

		System.out.println(" Enter numbers :- ");
		for(int i = 0 ;  i < size ; i++){

			inp[i] = Integer.parseInt(br.readLine());
		}
		Random_Remove rr = new Random_Remove();
		rr.remove_meth(inp);
	}
}