class Demo{

	void m1(int x){

		System.out.println(" int in m1 - 1");
	}

	void m1(int y ){

		System.out.println(" In int m1 - 2");
	}

	public static void main(String[] args) {
		
		Demo d  = new Demo();
		d.m1(10); // Error == Methods has same signature 
	}
}