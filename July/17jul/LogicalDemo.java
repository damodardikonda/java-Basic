class LogicalDemo{

	public static void main(String[] args) {
		
		int a=10;
		int b=20;

		boolean ans;

		//ans=a && b ---> Error.. bad operand type

		ans=(a!=b) && (a<b);//true
		System.out.println(ans);


		ans=(a!=b) || (a>b);//true
		System.out.println(ans);
		
	}
}