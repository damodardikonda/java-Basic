class LogicalChallenge{

	public static void main(String[] args) {
		
		int x=2;
		int y=3;
		boolean ans;

		ans=(++x < y++) &&(x++ < ++y);//false ans = 3<3 false
		System.out.println("ans= "+ans); false
		System.out.println("x= "+x);//3
		System.out.println("y= "+y);//4


		ans=(++x <= y++) ||(x++ > ++y);// 4 <=5
		System.out.println("ans= "+ans);//true
		System.out.println("x= "+x);//4
		System.out.println("y= "+y);//5


	}
}