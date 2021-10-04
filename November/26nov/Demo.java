
class Demo{
	
	void m1(int a , float b ){

	    System.out.println(" Int - float");
	}

	void m1(float a , int b){

		System.out.println(" Int");
		//return 0;
	}

	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.m1(1 , 1.2f);
	}
}