class MaxProfit{

	public static int maximumProfit(int price[] , int start , int end){

		if(start >= end )
			return 0;

		int profit = 0 ;

		for (int i = start ; i < price.length ; i++ ) {
			
			for (int j = i+1 ; j < price.length ; j++ ) {
				
				if(price[j] > price[i]){

					int curr_profit = price[j] - price[i] + maximumProfit(price , start , i-1)+maximumProfit(price , j+1 , end);
					profit = Math.max (profit,curr_profit);
				}
			}
		}

		return profit;
	}

	public static void main(String[] args) {
		
		 int price[] = { 100, 180, 260, 310,40, 535, 695 };
		 int n = price.length;

		 System.out.println(maximumProfit(price , 0 , n-1));
	}
}