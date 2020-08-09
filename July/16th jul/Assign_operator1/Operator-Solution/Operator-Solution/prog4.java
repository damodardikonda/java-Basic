
class UnaryOperator{

	public static void main(String []args){
	
		int a = 10,b=20,c=50,ans = 0;

		ans = --a + ++b + c--;
		
		System.out.println("Ans = " + ans);	
		System.out.println("a = " + a);	
		System.out.println("b = " + b);	
		System.out.println("c = " + c);	
	}
}

/*Explanation :
 *
 * --a + ++b + c--	a = 10 , b = 20 , c = 50
 *
 * 9 + ++b + c--	a = 9  , b = 20 , c = 50
 * 9 + 21 +  c--	a = 9  , b = 21 , c = 50
 * 9 + 21 +  50	  	a = 9  , b = 21 , c = 49
 * 
 *      
 *      ans = 80 
 *      a = 9
 *      b = 21
 *      c = 49
 */

 
