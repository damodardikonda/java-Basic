class DEF{
	
	
	int id ;



    DEF()
    {



 
    }

	DEF(int id){
		this();

		this.id =id;
	}

	void disp(){

		System.out.println(id);
	}

	public static void main(String[] args) {
		
		DEF d = new DEF(20);

		d.disp();
	}
}