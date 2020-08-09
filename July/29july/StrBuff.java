class StrBuff_Switch{
	
	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer("Damodar");//errorx not converted to int type

		switch(s){

			case "Damodar":
			  System.out.println("Damodar dikonda");
			  break;

			case "damodar":
			  System.out.println("damodar............");
			  break;


		}
	}
}