 /*Write a Java Program, which will contain one number ‘num’. Use the
following operators on it and print the output.
1. num >>>= 2
2. num <<= 3
3. num ^= 2
4. num = ++num
5. num = ~num
*/


class Diff_Operation{
	public static void main(String[] args) {
		
		int num=10;
		int ans=0;

		ans= num>>>=2;
		System.out.println(ans);
		System.out.println(num);

        ans= num<<=2;
		System.out.println(ans);
		System.out.println(num);

        ans= num^=2;
		System.out.println(ans);
		System.out.println(num);

        ans= ++num;
		System.out.println(ans);
		System.out.println(num);

        ans= ~num;
		System.out.println(ans);
		System.out.println(num);

	}
}