#include<stdio.h>

void main(){
     
     int a , b = 0;

	printf(" Enter 2 number");
	scanf("%d %d \n " ,&a ,&b);

	for (int i = a; i <= b; ++i)
	{
		if( i % 2 == 0){
		printf("%d\n", i);
	}
}
}