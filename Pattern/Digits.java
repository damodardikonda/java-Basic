class Digits{
	public static void main(String[] args) {
		
		int num=856743;

		int i=0,a,b;
		int square,cube;

		while(num != 0){

			i=num%10;

			if(i%2==0){
                  a=i;
				square=a*a ;

				System.out.print(square);

     		}

     		else {
                
                       b=i;
     			cube=b*b*b;

                System.out.print(cube);
     		}

     		num=num/10;
		}
	}
}