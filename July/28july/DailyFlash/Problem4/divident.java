class Divident{

      static boolean isDivisible(int div , int divisor){
        
        boolean ans;

        if(div % divisor ==0)

        	ans = true;
        else

             ans = false;

             return ans; 

      }
    

	public static void main(String[] args) {
		

		int div=8;
		int divisor=2;




		boolean answer;


		answer=isDivisible(div , divisor);

		System.out.println(" Answer is " + answer);


	}
}