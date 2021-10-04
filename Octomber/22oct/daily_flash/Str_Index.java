import java.util.Scanner;
class Str_Index{

    static void isIndexof(String s1 , char ch){
    	int index = 1;
        char c ; 

    	for (int i = 0 ; i < s1.length() ; i++ ) {
    	 
    	 c = s1.charAt(i);

    	 if(c == ch){

    	 	System.out.println( index + " Occurance = " + i);
    	 	index++; 
    	 }	

    	}
    }
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String s1 = sc.nextLine();
        
        System.out.println("Enter Character");
        char ch = sc.next().charAt(0);
		isIndexof(s1 , ch);

	}
}