class  RemoveDuplicate{

	public int remDuplicate(int num[]){
		
		if(num.length == 0)
			return 0 ;

		int i = 0;
		for (int j = 1 ; j < num.length ; j++ ) {
			
			if(num[i] != num[j]){

				i++;

				num[i] = num[j];
			}

		}

		return i+1;
	}
	public static void main(String[] args) {
		
		int num[] = {1,1,2,2,2,3,3};

		RemoveDuplicate rd =new RemoveDuplicate();
		int len = rd.remDuplicate(num);
		System.out.println(" length of non duplicate array is " + len);
	}
}