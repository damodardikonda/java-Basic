class Word_Format{
	
	public static void main(String[] args) {
		
		int num=2446;

		String number = String.valueOf(num);

		for(int i =0; i<number.length();i++){

			int j =Character.digit(number.charAt(i),10);
		
		
			switch(j){

				case 1:
				   System.out.print(" one");
				   break;

				case 2:
				   System.out.print(" Two");
				   break;

				 case 3:
				   System.out.print(" Three");
				   break;

				  case 4:
				   System.out.print(" Four");
				   break;

				   case 5:
				   System.out.print(" Five");
				   break;

                   case 6:
				   System.out.print(" Six");
				   break;

				   case 7:
				   System.out.print(" Seven");
				   break;
                     
                   case 8:
				   System.out.print(" Eight");
				   break;
				   
				   case 9:
				   System.out.print(" Nine");
				   break;

                   case 10:
				   System.out.print(" Ten");
				   break;

 			}
}
}
}