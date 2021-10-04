class Outer{

    int x = 10;
    static int y = 20;

    void m1(){

    	System.out.println("Outer class non static method");
    }


    static void m2(){

    	System.out.println("Outer class  static method");
    }

	class Inner{

          void disp(){

          	System.out.println("Value of x is = " + x);
          
          	System.out.println("Value of y is = " + y);
          	m1();
          	m2();

          }
	}

	public static void main(String[] args) {
		
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.disp();
	}

}