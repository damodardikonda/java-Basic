class LogicalChallenge{

	public static void main(String[] args) {
		
		int x=2;
		int y=3;
		boolean ans;

		ans=(++x < y++) &&(x++ < ++y);//false
		System.out.println("ans= "+ans);
		System.out.println("x= "+x);//3
		System.out.println("y= "+y);//4


		ans=(++x <= y++) ||(x++ > ++y);//
		System.out.println("ans= "+ans);//true
		System.out.println("x= "+x);//4
		System.out.println("y= "+y);//5


	}
}