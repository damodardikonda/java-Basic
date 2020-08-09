class Add_num{

	public static void main(String[] args) {
		
		/*int i=0,num=2346;
        int last;
		int arr[] = new int[20];

        while(num!=0){

        	last=num%10;
        
		for(i=0;i<=5;i++){

              arr[i]=last;
		}
	}

	System.out.println(arr[i]);

      int a=arr[1];
      int b=arr[3];

	System.out.println("First Element In array" + a);
	System.out.println("Last Element in Array" + b );


	int add = a+b;

	System.out.println(add);

*/



		
		int num=2446;
		int a=0,b=0,ans=0;

		String number = String.valueOf(num);

		for(int i =0; i<number.length();i++){

			 a =Character.digit(number.charAt(1),11);
	        b =Character.digit(number.charAt(3),15);

	         ans=a+b;

	
	}
                System.out.println(a);
                System.out.println(b);
		        System.out.println(ans);

}

}