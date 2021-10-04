import java.util.Scanner;

class MergedArray{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		int b[] = new int[5];

        int c[] = new int[10];
 
        int i = 0 , index = 0;

        System.out.println(" Enter The Numbers ");
        for ( i = 0 ; i<a.length  ; i++) {
        	
        	a[i] = sc.nextInt();
        }

       System.out.println(" Enter The Numbers for 2nd array");
        for ( i = 0 ; i<b.length  ; i++) {
        	
        	b[i] = sc.nextInt();
        }

for ( i = 0 ; i < a.length ; i++ ) {
	
	c[index ] = a[i];
	index++;
}


for ( i = index ; i < 10 ; i++ ) {
	
	c[index ] = b[i];
	index++;
}


       System.out.println(" Merged array");

for ( i = 0 ; i < c.length ; i++ ) {
	
	System.out.println(c[index ] );
	
}

	}
}