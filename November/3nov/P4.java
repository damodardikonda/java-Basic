class P4{
	
    int area_Square;
    int area_Rect;
	void P4(int side ){
       
        area_Square = side * side;
        System.out.println("Area of Square is = " + area_Square);

	}

     void P4(int length , int breadth){
         
         area_Rect = length * breadth;
         System.out.println("Area of rectangle is " + area_Rect);
     }

     public static void main(String[] args) {
     	P4 obj1 =  new P4();
     	obj1.P4(10);
        obj1.P4(10,20);

     }
}