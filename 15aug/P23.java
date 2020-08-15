/*
Write a Java program to take two numbers (hardcoded) and print its LCM
(Least Common Multiple).
Output: enter two numbers (Hardcoded): 10 15
LCM is 30.*/

class P23{
	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 15;
		int i = 100;
		
		int min = (n1 > n2)? n1 : n2;
         
        while(100 >=0){ 
		if( min % n1 == 0 && min % n2 == 0){

			System.out.println("LCM is = " + min);
			break;
		}

		++min;
		i++;
	}
	}
}