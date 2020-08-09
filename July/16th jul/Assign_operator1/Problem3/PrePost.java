/*
    What will be output for following statement when a=10 and b=20 c = 50
         a++ + ++b + ++c ?
*/


class PrePost{
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c=50;

		int ans=0;


		ans= a++ + ++b + ++c;  //10+21+51

		System.out.println(ans);//
		System.out.println(a);//11
		System.out.println(b);//21
		System.out.println(c);//51

	}
}