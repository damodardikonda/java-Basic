abstract class PowerCalculator{

	abstract void getResult(int number);
}

class SquareCalculator extends PowerCalculator{

	void getResult(int number){

		int square = number * number;
		System.out.println(square);
	}
}


class CubeCalculator extends PowerCalculator{

	void getResult(int number){

		int cube = number * number * number;
		System.out.println(cube);
	}
}

class Calculator{

	public static void main(String[] args) {
		
		PowerCalculator pc = new SquareCalculator();
		pc.getResult(10);

		CubeCalculator cb = new CubeCalculator();
		cb.getResult(10);
	}
}