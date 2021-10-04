class ABC{

	void m1(){

		System.out.println("ABC chi m1");

		class DEF{

			void m1(){

				System.out.println("DEF chi m1");

				class GHI{

					void m1(){

						System.out.println("GHI chi method");

						class JKL{

							void m1()
							{

								System.out.println("JKL chi method");
							}
						}

						JKL j =  new JKL();
						j.m1();
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





/*


C:\java\November\9nov>javap -c ABC$1DEF$1GHI$1JKL.class
Compiled from "Checkthis3.java"
class ABC$1DEF$1GHI$1JKL {
  final ABC$1DEF$1GHI this$2;

  ABC$1DEF$1GHI$1JKL(ABC$1DEF$1GHI);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #1                  // Field this$2:LABC$1DEF$1GHI;
       5: aload_0
       6: invokespecial #2                  // Method java/lang/Object."<init>":()V
       9: return

  void m1();
    Code:
       0: getstatic     #3                  // Field java/lang/System.out:Ljava/io/PrintStream;
       3: ldc           #4                  // String JKL chi method
       5: invokevirtual #5                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       8: return
}

*/