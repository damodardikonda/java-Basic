// Inserting at end

import java.util.Scanner;

class ArrIns{

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of array ");
		int n = sc.nextInt();		

		int a[] = new int[n+1];

		for (int i = 0 ; i < n ; i++ ) {
			
			a[i] = sc.nextInt();
		}

		System.out.println("Enter the number which you want to add " ) ;
		int num = sc.nextInt();

		a[n] = num;

		System.out.println("Entered Number is = ");
		for (int i = 0 ; i < a.length ; i++ ) {
			
			System.out.println(a[i]);
		}
	}
}
/*


import java.util.Scanner;
class Array8insert 
{
    public static void main(String[] args) 
    {
        int len, p,ele;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of an array:");
        len = sc.nextInt();
        int arr[] = new int[len+1];
        System.out.println("Enter "+len+" elements:");
        for(int i = 0; i < len; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element which you want to insert:");
        ele = sc.nextInt();
        arr[len] = ele;
        System.out.print("After inserting : ");
        for(int i = 0; i <len; i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.print(arr[len]);
        
    }
}
*/