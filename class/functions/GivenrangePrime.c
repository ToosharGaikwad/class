// print prime numbers given range

#include<stdio.h>

     int printPrime(int ,int);
    void main(){
	int first,last;
		printf("enter number");
		scanf("%d %d",&first,&last);
	
	 printPrime(first,last);
	}
	
	

      int printPrime(int first,int last){
       	
		for(int n= first;n<last;n++){
			for(int i=2;i<n;i++){
				if(n%i!=0){
			
				printf("%d number is   prime  ",i);
					break;
			}
			
			}
	
		}
       	
       	
	   }
		