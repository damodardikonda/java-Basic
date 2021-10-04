import java. util.Scanner;
class Char_index{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the index ");
		int index = sc.nextInt();

		System.out.println("Enter the Character");
		char ch = sc.next().charAt(0);

        System.out.println("Enter the String");
		StringBuffer sb = new StringBuffer(sc.next());
         
		for (int i = 0 ; i < sb.length() ; i++ ) {
			
			char c = sb.charAt(i);

			if(i == index){

				System.out.println("Character is  = " + c);
			    
			    
			}

			if(c == ch){
 
				System.out.println("index is = " + i);
			    break;
			}
		}

	}
}