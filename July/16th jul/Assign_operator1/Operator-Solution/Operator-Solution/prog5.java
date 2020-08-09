
class UnaryOperator{

	public static void main(String []args){
	
		int a = 10,b=20,c=50,ans = 0;

		ans = a++ + --b + c--;
		
		System.out.println("Ans = " + ans);	
		System.out.println("a = " + a);	
		System.out.println("b = " + b);	
		System.out.println("c = " + c);	
	}
}

/*
 * Explanation :
 * a++ + --b + c--	a = 10 , b = 20 , c = 50 
 *
 * 10  + --b + c--	a = 11 , b = 20 , c = 50
 * 10  +  19 + c--	a = 11 , b = 19 , c = 50
 * 10  +  19 + 50	a = 11 , b = 20 , c = 49
 *
 *	ans = 79
 *	a = 11
 *	b = 19
 *	c = 49
 */ 
