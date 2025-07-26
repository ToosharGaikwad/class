#include<stdio.h>
//void powof();
//void main(){
//	  powof();
//	
//	
//}
//// get a number and print a power of number 
//
//void powof(){
//
//   int no ,ex,res=1;
//   
//   printf("Enter a number");
//	scanf("%d %d ",&no,&ex);
//	for(int i=1;i<=ex;i++){
//		res=res*no;
//	}
//	printf("%d",res);
//
//}



// print prime numbers given range

int checkprime(int* ,int*);
void main(){
	int frist,last;
printf("enter number");
scanf("%d %d",&frist,&last);
	checkprime(&frist,&last);
	
}



int checkprime(int *frist,int *last){

for(int n= *frist;n<*last;n++){
	int isprime =1;
	for(int i=2;i<n-1;i++){
		if(n%i==0){
			isprime=0;
			break;
		}
		
	//	printf(" %d number is  prime  ",i)
	 
	}
	if (isprime) {
            printf("%d is a prime number\n", n);
        }
   
}	
 
}
