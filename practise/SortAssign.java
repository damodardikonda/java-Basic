
class SortArr{

	public static void main(String[] args) {
		
		int a[] = {2,1,0,2,0,1};
		for (int j = 0 ; j <a.length ; j++ ) {
			
		
 		for (int i = 1 ; i < a.length ; i++) {
 			
 			if(a[i-1] >  a[i]){

 				int temp = a[i];
 				a[i] = a[i-1];
 				a[i-1] = temp; 
 			}

 		}}

 		for (int  i = 0 ; i < a.length ; i++ ) {
 			
 			System.out.println(a[i]);
 		}

	}
}