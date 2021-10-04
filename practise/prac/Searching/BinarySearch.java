import java.util.*;

class BinarySearch{

	int find(int arr[] ,  int len , int k){
        int f = arr[0];
        int l =arr[len-1];
		int mid = (f+l)/2;

		while (f <= l) {
			
			if(arr[mid] > k){
				l = mid -1;
			}else if (arr[mid] == k ){

				return mid;
				
			}else {

				mid = f +1;
			}

			mid = (f+l)/2;
		}

		return -1;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Lenght of Array");
		int len =  sc.nextInt();

		int arr[] = new int[len];

		System.out.println("Enter te Elements ");

		for (int i = 0 ; i < len ; i++ ) {
			
			arr[i] = sc.nextInt();
		}

		System.out.println("Entered Numbers are");
		for (int i = 0 ; i < len ; i++ ) {
			
			System.out.println(arr[i]);
		}

        System.out.println("Enter te Key");
        int k = sc.nextInt();

        BinarySearch bs = new BinarySearch();
		int place = bs.find(arr , len , k);

		System.out.println("At position" + place);
	}
}