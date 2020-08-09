/*
Write a Java program for following operations and explain the error if any.
1.num=188 result = num>>>4
2.num=255 result1 = num<<<3
2. num = -108 result =num>>>23
3. num=-123 result1 = num<<<15
*/


class Shift{

	public static void main(String[] args) {
		
		int num1=188;
		int res1=0;

		res1 = num1 >>> 4;
		System.out.println("1:="+res1);//11


		/*
		int num2=255;
		int res2=0;

		res2 = num2 <<< 3;//in java  Unsigned left shift is not allowed
		System.out.println("2:="+res2);
		*/

		int num3=-108;
		int res3=0;

		res3 = num1 >>> 23;
		System.out.println("3:="+res3);//0

        /*
		int num4=-123;
		int res4=0;

		res4 = num4 <<< 15 ; //in java  Unsigned left shift is not allowed
		System.out.println("4:="+res4);
		*/

	}
}