/*Write a java code to find a self-dividing number in which all of the digits

are divisible by the number. (Take a while loop from 0 - 100 and print all the self-
dividing numbers).

Example: Number = 12. Here 1 and 2 divide 12*/

class P15{
	
	public static void main(String[] args) {
		
		int num = 8 ;
		int temp =num;
		int rem = 0;
		int rem1 = 0;
		while(num != 0 ){
        
             rem = num % 10;
             rem1 = num % 100;

              if((temp % rem == 0 )&&(temp % rem1 == 0)){

              	System.out.println(temp + " is self dividing number");
              	break; 
              }

		}
	}
}