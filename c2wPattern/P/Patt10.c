#include<stdio.h>

void main(){

	for (int i = 1; i <= 15; ++i)
	{
		if( i % 2 == 0){

			printf("%d = Even \n", i );
		}
		else{

			printf("%d = Odd\n", i );
		}
	}
}