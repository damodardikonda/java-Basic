class Word_Format2{
	
	public static void main(String[] args) {
		
		int num=2446;

		int rev=0;

		while(num!=0){

			rev = rev * 10 + (num %10);
			num = num/10;

		}

		int temp=rev;
		
		while(temp !=0){

			int rem = temp % 10;

		
			switch(rem){

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