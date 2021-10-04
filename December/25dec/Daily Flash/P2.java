interface A {

         interface B{

         	 void m1();
         }
}

class AB implements A , A.B{

     public void m1(){

     	System.out.println("m1 methods");
     }
}

class Test2{

	public static void main(String[] args) {
		
		A.B a = new AB();
		a.m1();
	}
}