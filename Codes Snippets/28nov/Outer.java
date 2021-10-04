class Outer{

	void my_meth(){

		int num = 23+1;
		num = num;

		class Inner{

			public void print(){

				System.out.println(num);
			}
		}

		Inner i = new Inner();
		i.print();
	}

	public static void main(String[] args) {
		Outer o = new Outer();
		o.my_meth();
	}}