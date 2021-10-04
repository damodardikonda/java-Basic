import java.util.*;

public class Election
{
	public static void findWinner(String votes[])
	{
		Map<String,Integer> map = new HashMap<String, Integer>();
		for (String str : votes)
		{
			if (map.keySet().contains(str))
				map.put(str, map.get(str) + 1);
			else
				map.put(str, 1);
		}

		int maxValueInMap = 0;
		String winner = "";
		for (Map.Entry<String,Integer> entry : map.entrySet())
		{
			String key = entry.getKey();
			Integer val = entry.getValue();
			if (val > maxValueInMap)
			{
				maxValueInMap = val;
				winner = key;
			}

			else if (val == maxValueInMap &&
				winner.compareTo(key) > 0)
				winner = key;
		}
		System.out.println(winner + );
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	String name[] = new String[n];
		for (int i = 0 ; i < n ; i++ ) {
			
			name[i] = sc.next();
		}

	findWinner(name);
	}
}
