/*
 What will be the output of the statement if i=5, j=4
1. (i++ >= j++) && (--j < i++)
2. (--i < j--) || (j++ >= ++i)
*/

class PostIncreDecre{

	public static void main(String[] args) {
		
		int i=5;
		int j=4;

		boolean ans;

		ans=(i++ >= j--) && (--j< i++);
		System.out.println(ans);

		ans=(--i < j--) || (j++ >= ++i);
		System.out.println(ans);


	}
}