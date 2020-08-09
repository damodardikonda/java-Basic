class Char_Switch{

	public static void main(String[] args) {
		
		char ch = 'A';//A-Z =65 -92  a-z = 97-122
	//char ch ='BG'; error
		//char x = '8'; 
	//	char ch = 40000 allowed
		 

		switch(ch){

			case 'A':
			   System.out.println(" A char");
			   break;

			case 'B':
			   System.out.println(" B char");
			   break;


			case '8':
			   System.out.println(" 8 char");
			   break;

			case 8:
			   System.out.println(" 8 val ");
			   break;
		}
	}
}