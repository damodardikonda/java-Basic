/*
Solve the Following Expressions and Write explanation of each operation
along with the order of precedence
1]. int a = 25, b = -34, c = 19, d = 4;
2]. int res = ((a << 2 | b >> 3)
3]. boolean result = ((a << 2 | b >> 3) < -10 ) || ((c++ << 2 & b-- >>> d) >= 23)
*/


class Precedence{

	public static void main(String args[]){

		int a = 25;
		int b = -34;
		int c = 19;
		int d =4;

		int res=0;

		res= (a << 2 | b >> 3);
		System.out.println(res);//-1

		boolean result;
		result = (( a << 2 | b >> 3) < -10) || (( c++ << 2 & b-- >>> d) >=23 );//1 i.e true because logical or work for only boolean datatype and  datatype is boolean..
		System.out.println(result);
	}
}