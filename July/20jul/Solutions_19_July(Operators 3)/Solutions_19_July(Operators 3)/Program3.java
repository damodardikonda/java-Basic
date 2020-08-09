/*Program to get the output of the given expression*/
class Program3
{
	public static void main(String[] args) {
	    
	    int num1=10,num2=5;
	    int num,mum;
	    System.out.println((num1++ | num2)&((++num2)^num1));
	}
}

/*Explanation:
    first the brackets() are solved since &-operator will require both left and right operands
    so solving (num1++ | num2)  where precedence of ++ is greator than | operator so num1 is inreamented from 10 to 11
    but in the expression it remains 10 due to post increament
    we have (10 | 5)----->15
    
    now for the right operand-> ++num2 here, preincreament is taking place and also num2 changes from 5 to 6 
        so we have (6 ^ 11)-----------> 13
        
        now for final, with both left and right operands available for & ----> 15 & 13 -----> 13 hence output
    */
