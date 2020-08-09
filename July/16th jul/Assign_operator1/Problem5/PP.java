/*
        5: What will be output for following statement when a=10 and b=20 c = 50
        a++ + --b + c-- ?

*/

class PP{

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c=50;

		int ans=0;


		ans= a++ + --b + c--;  //10+19+50=79

		System.out.println(ans);//79
		System.out.println(a);//11
		System.out.println(b);//19
		System.out.println(c);//49
	}
}