class Shape{

	void makeShape( int side){

		System.out.println(" Square is to be drawn with side = " + side);
	}
 
    void makeShape( int len , int breadth){
        
        int area = len * breadth ;
        System.out.println(" Area of rectangle is " + area);
    }

    void makeShape(float r){

    	double a = 3.14 * r * r ;

    	System.out.println( " Area of Rectangle is = " + a);
    }

	public static void main(String[] args) {
		
		Shape s = new Shape();
		s.makeShape(5);
		s.makeShape(4,5);
		s.makeShape( 6.8f);
	}
}