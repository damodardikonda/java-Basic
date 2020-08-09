class Prime{

	public static void main(String[] args) {
		
		int i = 1;
		int count=0;

         while(i<=200){

         	if((i%2==0)&&(i%i==0)){

         		System.out.println(i);
         		count=count+i;
         	}
         }
	}
}