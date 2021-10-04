class D{

	int a , b;

	D(){

		a = 10;
	}
}


class Demo{

	public static void main(String[] args) {
		
		
		 new D().a+=1;
		System.out.println(new D().a);
	}
}