//Repeat and Missing Number in java

class MissRepeat{

	public static void main(String[] args) {
		
		int arr[] = {1,2,2,3,4,6};
		int repeat = 0 , miss  = 0 ;
		int count [] = new int[arr.length + 1];

		for (int i = 0 ; i < arr.length ; i++) {
			
			count[i] =0;
		}

		for (int i = 0 ; i < arr.length ; i++ ) {
			
			if(arr[i] == 1)
				count[1]++;	
			if(arr[i] == 2)
				count[2]++;
			if(arr[i] == 3)
				count[3]++;
			if(arr[i] == 4)
				count[4]++;
			if(arr[i] == 5)
				count[5]++;
			if(arr[i] == 6)
				count[6]++;
		}

		for (int i = 1 ; i < count.length; i++ ) {
			System.out.println("count for " + i + " = " + count[i]);
			if(count[i] ==2)
				repeat = i;
			if(count[i]  == 0)
				miss = i;
	}

	System.out.println("repeat no = " + repeat);
	System.out.println(" Miss no = " + miss);
}
}