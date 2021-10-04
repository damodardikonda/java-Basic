import java.io.*;
class LinearSearch{

    int find(int arr , int len , int key){

    	for (int i= 0 ; i < len ; i++ ) {
    		
    		if(arr[i] == key){
    			return i;
    		}
    	}
    	return -1;
    }
	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter the Length of Array");
		int len = Integer.parseInt(br.readLine());

        int arr[] = new int[len];

        System.out.println("Enter " + len + "Numbers");
		for (int i = 0 ; i < len ; i++ ) {
			
			arr[i] = Integer.parseInt(br.readLine());
		}
      
      	System.out.println(" Enter Number to find");
        int key = Integer.parseInt(br.readLine());
		LinearSearch ls = new LinearSearch();
		int place = ls.find(int arr , int len , int key);
	
         System.out.println(" Number found at " + place + " Position");
	}
}