class C2W{
	
	public static void main(String[] args) {
		
		int var1=0;
		int var2=0;

		for(int var3=0;var3<5;var3++){

			if(( ++var1 > 2) && (++var2 >2)){

				++var1;
			}
		}

		System.out.println(var1+" "+var2);
	}
}