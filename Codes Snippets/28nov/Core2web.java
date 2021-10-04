class Demo{

	int var = 100;

	Demo( Integer var ){

		System.out.println(" In Demo Constructor ");
	}
}

class Core2web{

	public static void main(String[] args) {
		
		Demo d = new Demo(100);
	}
}