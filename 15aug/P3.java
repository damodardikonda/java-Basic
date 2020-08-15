/*

Program 3: Write a Program that prints occurrences of a digit from a number, Take
input hardcoded Number: 345669760562. Digit to check Frequency: 6 
*/

class P3{
	public static void main(String[] args) {
		
		long num = 345669760562l;
		long i = 0 , rem = 0;
		int count = 0;
	      
	      while(num !=0 ){
	      	rem = num % 10;
            
            if(rem == 6){
            	count = count + 1;
            }

            num = num / 10;
	      }

            System.out.println(count +"  number of times 6 apperare ");
	}
}