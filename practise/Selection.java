import java.util.Scanner;

class Selection{

    public static void selectSort(int arr[]){

    	for (int i = 0; i < arr.length ; i++ ) {
    		int index = i;
    		for (int j = i+1 ; j < arr.length ; j++ ) {
    			
    			if(arr[j] < arr[index]){

    				index = j;
    			}
    		}
    	

    	int temp = arr[index];
    	arr[index] = arr[i];
    	arr[i] = temp;
    }

}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array");
		int len = sc.nextInt();

		int arr[] = new int[len];

		for (int i=0 ;  i<arr.length ; i++ ) {
			
			arr[i] = sc.nextInt();
		}

		Selection.selectSort(arr);

		for (int i = 0 ; i < arr.length ; i++) {
			
			System.out.println(arr[i]);
		}
	}
}