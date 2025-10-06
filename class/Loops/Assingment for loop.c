// print a table 5  in for loop
#include<stdio.h>
void main(){
//int no=5;
//for(int i=1;i<=10;i++){
//	int r = no*i;
//	printf("%d \n",r);
//}

// print prime numbers given range
//
//int n,i,frist,last;
//printf("enter number");
//scanf("%d %d",&frist,&last);
//for(int n= frist;n<last;n++){
//	for(i=2;i<last;i++){
//		if(n%i==0)
//		break;
//	//	printf(" number is  prime  ");
//		
//	}
//	if(i==n)
//	printf("%d",i);
//}


 //find the perfect number given range
//
//int first,last,rem,j;
//
//   printf("enter a number ");
//
//   scanf("%d %d",&first,&last);
//for(int i=first;i<last;i++){
//	 int sum = 0;
//	for(int j=1;j<i;j++){
//		
//	if(i%j==0){
//		sum =sum +j;
//		
//	}
//	   
//	 
//	   }	if(sum==i){
//		printf("number is perfect %d \n",i);
//
//	    
//}
//
//}





  //check the given number is strong or not

int fd,ld,i;
int r;
int temp =i;
printf("enter a range of numbers");
scanf("%d %d",&fd,&ld);
for(int i=fd;i<=ld;i++){
int	n=i;

int sum=0;
while(n>0){
  
r=n%10;
int fact = 1;
for(int j=1;j<=r;j++){
	
	fact=fact*j;
	printf(" %d   ",fact);
}
//sum=sum+fact;
n=n/10;	
printf(" %d ",sum);
}
//
if(sum==i)
printf("%d",i);

}
}






	








