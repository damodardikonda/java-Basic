class MaximumDiffrence
{
	int maxDiff(int arr[], int arr_size)
	{
		int max_diff = arr[1] - arr[0];
		int i, j;
		for (i = 0; i < arr_size; i++)
		{
			for (j = i + 1; j < arr_size; j++)
			{
				if (arr[j] - arr[i] > max_diff)
					max_diff = arr[j] - arr[i];
			}
		}
		return max_diff;
	}
	
public static void main(String[] args)
	{
		MaximumDiffrence maxdif = new MaximumDiffrence();
		int arr[] = {14,12,70,15,95,65,22,30};
		System.out.println("Maximum differnce is " +maxdif.maxDiff(arr, 5));
	}
}