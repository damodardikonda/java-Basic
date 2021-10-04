#include<stdio.h>

void main(){

	const int a = 10;
	int *iptr = &a ;
	*iptr =  11 ;
	printf("%d\n", a );
}