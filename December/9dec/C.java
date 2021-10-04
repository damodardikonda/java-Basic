class P{

	int x = 10 ;

}

class C extends P {

     int x = 20 ;

     void disp(){

     	System.out.println(" The Value of X is = " + super.x);
     }

     public static void main(String[] args) {
     	
     	C c = new C();
     	c.disp();
     }
}