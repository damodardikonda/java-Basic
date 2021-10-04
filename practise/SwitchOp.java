import java.util.*;
class SwitchOp{

	public static void main(String[] args) {
		
		int a= 50;
		int b = 20;

		Scanner sc = new Scanner(System.in);

		char op = sc.next().charAt(0);

		switch(op){

			case '+':
				int add = a + b;
				System.out.println(add);
				break;
			case '-':
				int sub = a-b;
				System.out.println(sub);
				break;
		}
	}
}