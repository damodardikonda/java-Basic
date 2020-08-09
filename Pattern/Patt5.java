class Patt5{

	public static void main(String[] args) {
		
		int num=1;
		for(int i=1;i<=5; i++){

			for(int j=5;j>=i;j--){
            
                 if(i%2==0){
                 System.out.print(num*num*num + " ");
             }
             else{

             	System.out.print(num*num+ " ");
             }


			}
			System.out.println();
			                 num++;

		}
	}
} 