class ABC{

	void m1(){

		System.out.println("ABC chi m1");

		class DEF{

			void m1(){

				System.out.println("DEF chi m1");

				class GHI{

					void m1(){

						System.out.println("GHI chi method");
					}
				}


				GHI g = new GHI();
				g.m1();
			}


		}


		DEF d = new DEF();
		d.m1();


	}

	public static void main(String[] args) {
		
		ABC a = new ABC();
		a.m1();
	}
}