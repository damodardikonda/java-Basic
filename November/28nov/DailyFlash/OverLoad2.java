class OverLoad2{

	void m1( int a ){
       
          System.out.println(" integer method");
 	}

 	void m1( float d){

 		System.out.println(" Floating Method");
 	}

 	public static void main(String[] args) {
 		
 		OverLoad2 ol = new OverLoad2();
 		ol.m1('A'); // integer method karan character internally as an integer store hot..
 	}
}