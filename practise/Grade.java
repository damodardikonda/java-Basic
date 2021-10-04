import java.io.*;

class Grade{
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Maths marks");
		int maths = Integer.parseInt(br.readLine());

		System.out.println("Enter Physics");
		int physics = Integer.parseInt(br.readLine());

		System.out.println("Enter Chemistry");
		int c = Integer.parseInt(br.readLine());

		int sum = maths+physics+c;
		int total = 300;

		float avg = (float) (sum/total)*100;

		int grade = (int)avg;

		switch(grade/10){

			case 9:
				System.out.println("A");
				break;
			case 8:
			case 7:
			case 6:
				System.out.println("B");
				break;
			case 5:
			case 4:
			case 3:
				System.out.println("C");
				break;
			default:
				System.out.println("Not Pass");
		}

	}
}