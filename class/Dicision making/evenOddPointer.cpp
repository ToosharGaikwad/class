#include<stdio.h>
int evenOdd();
int main(){

int res = evenOdd();

if(res ==1){
	printf("number is positive");
}else if(res ==0){
	printf("number is negative");
	return 0;
}
}

int evenOdd(){
		int no ;
		scanf("%d",&no);
	if(no>0 ){

		return 1;
	}else{
		return 0;
	}
}