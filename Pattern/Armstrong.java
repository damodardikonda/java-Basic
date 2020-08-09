class Armstrong{
	
	public static void main(String[] args) {
		
		int i;
        int ld;
         int mul=0;
         int sum=0;
         int a,temp;

       for(i=100;i<=500;i++){

          a=i;
          temp=i;

       	while(a!=0){

       		ld=a%10;
       		a=a/10;
       		mul = ld*ld*ld;
       		sum=sum+mul;


       	}

     if(temp == sum){

       	System.out.print(temp + " ");
       
       	
		
		
       }

       }

       


		
	}
}