import java.util.*;
class Item{
	int value = 0;
	int weight = 0;
	Item(int value , int weight){

		this.value = value;
		this.weight = weight;
	}
}

class KnapComaparator implements Comparator<Item>{

	public int compare(Item i1 , Item i2){
	 
	 	double d1 = (double)(i1.value) /  (double)(i1.weight);
	 	double d2 = (double)(i2.value) /(double)(i2.weight);

	 	if(d1 < d2)
	 		return 1;
	 	else if (d1 > d2)
	 		return -1;
	 	else
	 		return 0;
	}

}
class FracKnapsack{

	public int maxThings(int values[] , int weight[] , int w){

		ArrayList<Item> al =  new ArrayList<Item>();
		for (int i =  0 ; i < values.length ; i++ ) {
			
			al.add(new Item(values[i] ,weight[i]));
		}

		Collections.sort(al , new KnapComaparator() );
		int max_values = 0 , current_weight = 0;
		for (int i = 0 ; i < values.length ; i++ ) {
			
			if(al.get(i).weight + current_weight < w){

				current_weight = current_weight+al.get(i).weight;
				max_values = max_values+al.get(i).value;
			}else{

				int available_weight = w - current_weight ;
				max_values += ((double) al.get(i).value) /((double) al.get(i).weight) * (double)available_weight;
				
			}
		}

		return max_values;
	}

	public static void main(String[] args) {
		
		int values[] = {60,100,120};
		int weight[] = {10, 20, 30};
		int w = 50;

		FracKnapsack fk = new FracKnapsack();
		int max = fk.maxThings(values , weight , w);
		System.out.println(max + " is the max value");
	}
}