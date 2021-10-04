/*
	suppose thi is an stock [7,1,5,3,6,4] 
		then tell us maximum pofit from it 
		if you buy at =1 and sell at 5 ==> loss(-4)
		if you buy 1 and sell at 6 ten ====> profit (5)
		i.e. find out maximum profit and return it.......
*/

class BuySell{
	
	static int findMaxProfit(int[] stock){

		int minprice = Integer.MAX_VALUE;
		int maxprofit = 0;

		for (int i = 0 ; i < stock.length ; i++ ) {
			
			if(stock[i] < minprice)
				minprice = stock[i];
			else if(stock[i] - minprice > maxprofit){
				maxprofit = stock[i] - minprice;
			}
		}
		return maxprofit;
	}
	public static void main(String[] args) {
		
		int stock[] = {7,1,5,3,6,4};

		int ans = findMaxProfit(stock);

		System.out.println(ans);
	}
}