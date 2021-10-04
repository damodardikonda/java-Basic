// Detect 101 pattern from strin

class PatternDetect{

	public static void main(String[] args) {
		
		String str =  "110101001010100";

		int i= 0 ;
		int count = 0 ;
		while(i < str.length()-2){

			int j = i+1;
			int k = j+1;

			if(str.charAt(i)== '1'){
					
				if(str.charAt(j) == '0'){

					
					if(str.charAt(k) == '1'){

						count++;
					}
				}

			}
			i++;j++;k++;
		}

		System.out.println("101 detected  = " + count);
	}
}