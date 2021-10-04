import java.util.Scanner;

class Str12aa{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String strnum = "aabcccccaaa";
		String s = new String(sc.next());
		int pos = 0;
		for (int i = 0 ;i < s.length() ; i++) {
			
			if(s.charAt(i) > 47 && s.charAt(i) < 58)
				strnum = strnum+s.charAt(i);
			else{
				pos = i;
				break;
			}
		}

		int numbers = Integer.parseInt(strnum);
		int count = 0;

		for(int i = pos ; i < s.length() ; i++)
			count++;

		if(numbers == count)
			System.out.println("True");
		else
			System.out.println("False");
	}
}