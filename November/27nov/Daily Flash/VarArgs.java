class VarArgs{
	
	void num( int a){

		System.out.println(" 1 int method");
	}

	void num ( int a , int b){

		System.out.println(" 2 int method");
	}

	void num( int ...var){

		System.out.println(" VarArgs method");
	}
     

     public static void main(String[] args) {
     	
     	VarArgs v = new VarArgs();
     	v.num();
     	v.num(1);
     	v.num(1,2,23,3,34,4,1,21,2,3,4,4);
     	v.num(1,2);
     }
}

