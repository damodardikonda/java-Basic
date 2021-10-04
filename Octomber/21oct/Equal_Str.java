import java.util.Scanner;
class Equal_Str{

     static boolean isEqual(String s1 , String s2){

     	char c , d;
     	int l1 = s1.length();
     	int l2 = s2.length();
        boolean match = true;
     	if(l1 == l2){

     		for (int i = 0 ; i < l1 ; i++ ) {
     			
     			c = s1.charAt(i);
     			d = s2.charAt(i);
     			if(c == d){
     				match = true;
                 }
     			else {
     				match = false;
     			
     			}

     		}

     		return match;
     	}

     	else{
     		return match;
     	}
     }

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String s1 = sc.next();
		String s2 = sc.next();

		if(isEqual(s1,s2)){

			System.out.println("String is Equal");
		}
		else{

			System.out.println("String is not Equal");
		}
	}
}