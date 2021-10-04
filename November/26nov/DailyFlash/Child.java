class GrandParent{

	int a = 100 , b= 200 ;
}

class Parent extends GrandParent{

	int x = 300 , y = 400 ;
}

class Child extends Parent{
     
     int add = 0;

	void addition(){

        add = super.a + super.b + super.x + super.y;
        System.out.println("Addition of variables are = " + add);
	}

	public static void main(String[] args) {
		
		Child c = new Child();
		c.addition();
	}
}