/*4: What will be output for following statement when a=10 and b=20 c = 50
--a + ++b + c-- ?*/

class PostPre{
	public static void main(String arg[]){

		int a=10;
		int b=20;
		int c=50;

		int ans=0;


		ans= --a + ++b + c--;  //9+21+50=80

		System.out.println(ans);//80
		System.out.println(a);//9
		System.out.println(b);//21
		System.out.println(c);//49
	}
}