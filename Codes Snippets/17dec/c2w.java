class c2w{

	int m = 40;

	void ad(){

		class MM{

			void org(){

                m+=1;
				System.out.println(m);
			}
		}
		new MM().org();
	}

	public static void main(String[] args) {
		
		new c2w().ad();
	}
}