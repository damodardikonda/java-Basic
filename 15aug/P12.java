/*Ternary Operator working with other operators. Take 3 variables as
follows and perform the following 4 operations, print the value of ans, i, j, k after
each operation, also solve each operation on notebook and send it to your group
leader via email.

int i = 5; int j = 10; int k = 15; boolean ans;
a] ans = (i < (j - 10))? true: false;
b] ans = (i == (i = j))? true: false;
c] ans = ((i & j & k) != 0)? true: false;
d] ans = ((i ^ j >> 2) == 0)? true: false;*/

class P12{
	public static void main(String[] args) {
		
		int i = 5; int j = 10; int k = 15;
        boolean ans ;

            ans = (i < (j - 10))? true: false;
            System.out.println(ans);//false
 
            System.out.println("i " +i); // 5
            System.out.println("j = " + j); // 10

            ans = (i == (i = j))? true: false;
            System.out.println(ans); //false

            System.out.println("i " +i); // 10
            System.out.println("j = " + j); //10

            ans = ((i & j & k) != 0)? true: false;
            System.out.println(ans); //true

            System.out.println("i " +i); // 10
            System.out.println("j = " + j); //10

            
          ans = ((i ^ j >> 2) == 0)? true: false;
          System.out.println(ans); //false
            

	}
}