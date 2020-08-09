// Findout the number is even or odd using ternamry
//input= 10 output= 10 is even


class Even_Odd_ternary{


	public static void main(String[] args) {
		
		int a=10;

		String ans=null;

		ans= ( a % 2 == 0 ) ? "Even Number" : "Odd Number";
		System.out.println(ans);

	}
} 