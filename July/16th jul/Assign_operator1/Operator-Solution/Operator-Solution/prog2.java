
class Calculator{

	int num1;
	int num2;

	void add(){
	
		System.out.println("Addition = " + (num1 + num2));
	}
	void sub(){
	
		System.out.println("Subtraction = " + (num1 - num2));
	}
	void mul(){
	
		System.out.println("Multiplication = " + (num1 * num2));
	}
	void div(){
	
		System.out.println("Division = " + (num1 / num2));
	}
	void mod(){
	
		System.out.println("Modulas = " + (num1 % num2));
	}

	public static void main(String[] args){
	
		Calculator obj = new Calculator();
		obj.num1 = 20;
		obj.num2 = 10;
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
		obj.mod();

	}
}
