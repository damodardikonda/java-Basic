class Nested_Ternary{

	public static void main(String[] args) {
		
		int x=50;
		int y=45;
		int z=40;

		int res=0;

		res=( x > y)? ( ( x > z )? x : z ) : ( ( y > z) ? y : z) ;
		System.out.println(res);
	}
}