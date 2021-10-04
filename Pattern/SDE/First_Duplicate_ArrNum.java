import java.util.Scanner;

class ArrDuplicate{
/*
	public void findFirstDuplicate(int arr[]){

		int count[] = new int[arr.length+1];

		for (int i = 0 ; i < arr.length ; i++) {
			
			switch(arr[i]){

				case 1 :
					count[1]++;
					if(count[1] == 2)
						System.out.println(" 1 is duplicate");
						break;

				case 2 :
					count[2]++;
					if(count[2] == 2)
						System.out.println(" 2 is duplicate");
						break;

				case 3 :
					count[3]++;
					if(count[3] == 2)
						System.out.println(" 3 is duplicate");
						break;

				case 4 :
					count[4]++;
					if(count[4] == 2)
						System.out.println(" 4 is duplicate");
						break;

				case 5 :
					count[5]++;
					if(count[5] == 2)
						System.out.println(" 5 is duplicate");
						break;

				case 6 :
					count[6]++;
					if(count[6] == 2)
						System.out.println(" 6 is duplicate");
						break;

				case 7 :
					count[7]++;
					if(count[7] == 2)
						System.out.println(" 7 is duplicate");
						break;

				case 8 :
					count[8]++;
					if(count[8] == 2)
						System.out.println(" 8 is duplicate");
						break;

				case 9 :
					count[9]++;
					if(count[9] == 2)
						System.out.println(" 9 is duplicate");
						break;



			}
		}
	}*/

	void findFirstDuplicate(int arr[]){

		int slow = arr[0];
		int fast = arr[0];

		do{
			slow = arr[slow];
			fast = arr[arr[fast]];

		}while(slow != fast);

		fast = arr[0];

		while(fast != slow){

			fast = arr[fast];
			slow=  arr[slow];
		}

		System.out.println("duplicate number is = " + slow);
	}
	public static void main(String[] args) {
		
		Scanner  sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];

		for (int i = 0 ; i <arr.length ; i++ ) {
			
			arr[i] = sc.nextInt();
		}

		ArrDuplicate ad = new ArrDuplicate();
		ad.findFirstDuplicate(arr);
	}


}