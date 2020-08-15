/*

Write a java code to count the number of steps required for a number to
reduce it to zero.(Take a hardcoded value and write the number of steps required to
make it zero).
Input - num = 8
Output - steps required = 4
Input - num = 123
Output - steps required = 12.

*/

class P14{

	public static void main(String[] args) {
		
		int num = 8 ;
		int i = 1;
        int count = 0;
		while(num  ==0){
        
           if(num % i ==0){

           	count++;

          }
           num--;

     }
    
		System.out.println("Input = " + num);
		System.out.println("output = " + count);
	}
}