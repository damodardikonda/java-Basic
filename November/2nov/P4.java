class P4{
	
	String name ;
	P4( String name){
         this.name = name;
          System.out.println("String Name is = " + this.name);
         

	}

	void disp(){

		System.out.println("String name is  = " +name);
	}
	public static void main(String[] args) {
		
		P4 obj = new P4("Damodar");
		obj.disp();
	}
}