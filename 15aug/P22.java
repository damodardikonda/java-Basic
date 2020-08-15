/*

Write a program to check whether given hardcoded char is a vowel or a
consonant.
Follow the outline.
1. Take a String to only store if vowel, then sVar: Vowel
2. Otherwise sVar Consonant
3. Use the switch statement to print whether it is a vowel or consonant using
input to switch as sVar.


*/

class P22{
	
	public static void main(String[] args) {
		
		char svar = 'a';
		boolean vov = false;

		switch(svar){

			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':

			     vov =  true;


		}

		if(vov == true){
			System.out.println("it is vowel ");
}
        else if((svar >= 'a' && svar <= 'z') || (svar >= 'A' && svar <= 'Z')){

        	System.out.println(" it is consonant");
        }else

            System.out.println(" Enter character not number");


		}
	}
