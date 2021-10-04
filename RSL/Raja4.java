
class P4{

	public static void main(String[] args) {
		
		for(int i = 100 ; i < 501 ;i++){

			if((i% 7 == 0 )&&(i%11==0))
				System.out.println("Not a Valid Output");
			else if(i % 7 == 0)
				System.out.println("Raja");
			else if(i % 11 == 0)
				System.out.println("Software");
			else
				System.out.println(i);

		}
	}
}