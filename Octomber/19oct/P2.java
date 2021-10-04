
class P2{
	
     public static void main(String[] args) {
     	
     	int num[] = new int[5];

     	int n = 5 , a = 1;

     	for (int i = 0 ; i < num.length ; i++ ) {
     		
     		int s = n*a;

     		num[i] = s ;

     		a++;
     	}


     	for (int i =  num.length - 1 ; i >=0  ; i-- ) {
     		
     		System.out.println(num[i] + " ");
     	}
     }
}