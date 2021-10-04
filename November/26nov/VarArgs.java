class VarArgs{

	void m1( int a ){

		   System.out.println(" 1 int method");
	}

	void m1( int a , int b){

		System.out.println(" 2 int method");
	}

	void m1( int ...var){

		System.out.println(" Var Arguments");
	}
}

class VarArgs2{

	public static void main(String[] args) {
		
		VarArgs va = new VarArgs();
		va.m1(10);
		va.m1(200 , 3000);
		va.m1(1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1);
	}
}