/*
Write a Program that takes a number as input from and prints only those
digits from that number, which are prime.
I/p:141 (Take a hard coded value)
O/p: the prime digit from the number 141 is 1,
*/

class P8{
	public static void main(String[] args) {
		
		int num = 145 ;
        int rem = 0;
        int count = 0;
        int temp =0;
		while(num != 0){
  
          rem = num % 10 ;
 
         temp = rem ;

         for(int i = temp ; i >= 1 ; i-- ){

         	if(temp % i == 0){

         		count = count + 1;
         	}


         

 if(count == 2){

			System.out.println( rem + " is prime Number");
		}
	
         	num = num / 10;
		}

        

	}
}}