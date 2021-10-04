/*

 Write a program to take input of 2 numbers and print all the prime numbers ranging
between them and print their count.
Note: If there are no numbers to print then print a message that indicates the same.
Input:
0 30
Output:
2 3 5 7 11 13 17 19 23 29
The count is: 10
Input:
8 10
Output:
The count is: 0
No prime numbers to display

*/
import java.io.*;
class PrimeCount{

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        System.out.println("EnteredThe Number : ");
        int num1 = Integer.parseInt(br.readLine());

 		System.out.println("Enter The Number : ");
        int num2 = Integer.parseInt(br.readLine());
        int counter = 0;
        String primenumber = " ";
        for (int i = num1 ; i <= num2 ; i++ ) {
       			int count = 0; 	
        	for (int j = i ; j >= 1 ; j-- ) {
       
        		if(i%j ==0 ){

        			count++;
         		}
        	}

        	if(count == 2){

        		primenumber = primenumber + i + " ";
        		counter++;
        	}
        }

        System.out.println("PrimeNumber is : " + primenumber);
        System.out.println("Counter is  =  " + counter);
	}
}