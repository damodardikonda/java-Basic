import java.util.*;
class Password{

    static boolean isValid(String pass){

    	int len = pass.length();
        int digit , ss =0;
    	if(len >= 8){

    		for (int i = 0 ; i < len ; i++ ) {
    			
    			if(pass.charAt(i) >= '0' || pass.charAt(i) <= '8'){

    				digit++;
    			}else if(pass.charAt(i) == '%' || pass.charAt(i) == '#' || pass.charAt(i) == '@' || pass.charAt(i) == '*'){
             
                      ss++;

    			}
    		}

    		if(digit > 0 && ss > 0){

    			return true;
    		}
    		else{

    			return false;
    		}
    	}

    	return false;
    }
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enterr the String");
		String pass = sc.nextLine();


		if(isValid(pass)){

			System.out.println("Valid Password");
		}else{

			System.out.println("Invalid Password");
		}


	}
}