class C2W{
	
	int var1 = 10;

	 C2W(){

        int var1 = 20;
	}

	public static void main(String[] args) {
		
		C2W w = new C2W();
		System.out.println(w.var1);
	}
}