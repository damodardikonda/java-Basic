import java.util.*;

class SumLarge{

	public static void main(String[] args) {
		
		int num[][] = new int[3][3];
		int sum = 0 , large = 0;

		Random rand = new Random();
		for (int  i = 0 ; i < num.length ; i++ ) {
			
			for (int j = 0 ; j < num[i].length ; j++ ) {
				
				num[i][j] = rand.nextInt(100);
			}
		}
		large = num[0][0];

		for (int i = 0 ; i < num.length ; i++ ) {
		 	
		 	for (int j = 0 ; j < num[i].length ; j++ ) {
		 		
		 		if(num[i][j] % 2== 0){

		 			sum = sum + num[i][j];
		 		}

		 		if(large < num[i][j])
		 			large = num[i][j];
		 	}
		 } 


		 System.out.println("Sum of Odd Number is = " + sum);
		 System.out.println(" Larege number is = " + large);
	}
}