#include <stdio.h>
void perfectnum(int*,int*);
void main(){
	int first,last,rem,j;

   printf("enter a number ");

   scanf("%d %d",&first,&last);
   perfectnum(&first,&last);

}



//find the perfect number given range
void perfectnum(int* first,int* last){
	for(int i=*first;i<*last;i++){
	 int sum = 0;
	for(int j=1;j<i;j++){
		
	if(i%j==0){
		sum =sum +j;
		
	}
	   }	if(sum==i){
		printf("number is perfect %d \n",i);
}
}
}