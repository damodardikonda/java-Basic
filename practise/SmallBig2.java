import java.util.Arrays;

class SmallBig2{

	public static void main(String[] args) {
		
		int a[] = {4,2,6,1,9,5};

		Arrays.sort(a);
		String s1 = Arrays.toString(a);

	char small = s1.charAt(1);
		int n = s1.length()-2;
		char big = s1.charAt(n);

		System.out.println("small = " + small);
		System.out.println("Big = " + big);
	}
}