/*

     Write a Java Program, which will contain 2 numbers. Use the following
     operators on it.
		1. less than (<)
		2. Greater than (>)
		3. Less than or equal to (<=)
		4. Greater than or equal to (>=)
		5. Equivalent (==)
		6. Not equivalent (!=)
*/



class Operate{

	public static void main(String[] args) {
		 
		 int a = 10;
		 int b = 20;
		 boolean ans;

		 ans = a<b;
		 System.out.println(ans);

		 ans = a>b;
		 System.out.println(ans);
         
         ans = a<=b;
		 System.out.println(ans);
        
        ans = a>=b;
		 System.out.println(ans);

        ans = a==b;
		 System.out.println(ans);

        ans = a!=b;
		 System.out.println(ans);

	}
}