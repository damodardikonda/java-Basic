class StaticMethInner{

    int x = 10;
    static  int y = 20;
	void meth1(){

		class Xyz{

			void m1(){
                System.out.println(x);
				System.out.println(y);
			}
		}
	}


	static void meth2(){

         class ABC{

         	void m2(){

         		
         		System.out.println(y);
         	}
         }
	}

	public static void main(String[] args) {
		
		StaticMethInner s = new StaticMethInner();
		s.meth1();
		meth2();
	}
}