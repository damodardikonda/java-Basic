class CC{
	
	int var1 = 10 ;
	CC(int var1){

		var1 = var1;

	}

	int getVar(){

		return var1 ;
	}

	public static void main(String[] args) {
		
		CC ff = new CC(100);
		System.out.println(ff.getVar());

	}
}