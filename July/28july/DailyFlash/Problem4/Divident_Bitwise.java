class Divident{

      static boolean isDivisible(int div ){
        
        boolean ans;

        if((div ^ 1) == div + 1) 

        	ans = true;
        else

             ans = false;

             return ans; 

      }
    

	public static void main(String[] args) {
		

		int div=18;




		boolean answer;


		answer=isDivisible(div );

		System.out.println(" Answer is " + answer);


	}
}