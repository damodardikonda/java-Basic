/*

1 2 3 4 5
1 2 3 4
1 2 3
1 2
1


*/

class P16{
	
    public static void main(String[] args) {

     
int num = 1;
     for(int i = 1 ; i <= 5 ; i++){

     	for(int j=5 ; j >= i ; j--){

     		System.out.print(num + " ");
     		num++;
     	}
         num = 1;
     	System.out.println();
     }	
  }
}