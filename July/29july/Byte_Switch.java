class Byte_Switch{

	public static void main(String[] args) {
		
		byte s = 100;
		//byte s = 128; error because byte cannot convert into int
		 

		switch(s){

			case 100:
			   System.out.println("First Case");
			   break;

			case 110:
			   System.out.println("Second Case");
			   break;
		}
	}
}