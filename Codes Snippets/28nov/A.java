class A{

	public static void main(String[] args) {
		
		char c[] = {

			'a','b','c','d','e','f','g','h','i','j','k','l','m'
		};

		char x[] = new char[6];

		System.arraycopy(c ,4 , x , 0,6);
		System.out.println(new String(x));
	}
}