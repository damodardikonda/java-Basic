class Vehicle{

	int max_speed = 200;
}

class Car extends Vehicle{

	int speed = 280;

	void display(){

		System.out.println("The Super keyword speed is" + super.max_speed);//200


		System.out.println("The Super keyword speed is" + speed);//280

	}
}
class Super_vehicle{
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.display();
	}
}