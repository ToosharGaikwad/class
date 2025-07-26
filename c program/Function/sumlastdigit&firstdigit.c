 //find the sum of frist and last digit
#include<stdio.h>



void main(){
	int no ;
	scanf("%d",&no);
	int ld = no%10, fd ;  
findSum(&no,&ld,&fd);	
}

  void findSum(int* no,int* ld,int* fd){
	
while(no>0){
	 fd = no*%10;
	  no* = no*/10;

}

int sum=ld+fd;
printf("%d",sum);
}