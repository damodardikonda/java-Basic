
class Demo{
	
	void m1(int a , float b ){

	    System.out.println(" Int - float");
	}

	int m1(int a , float b){

		System.out.println(" Int");
	}

	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.m1(1 , 1.2f);
	}
}