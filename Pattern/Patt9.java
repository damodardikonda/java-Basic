class Patt9{
	
	public static void main(String[] args) {
		
		        char ch = 'A';       
        int number = 4;
        int count = number - 1;
        for (int k = 1; k <= number; k++) {
            for (int i = 1; i <= count; i++)
                System.out.print(" ");
            count--;
            for (int i = 1; i <= k; i++)
                System.out.print(ch);
            System.out.println();
            ch++;
    
		


			}
		}
	
}