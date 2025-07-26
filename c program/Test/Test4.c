#include<stdio.h>

void main(){
	// find commen element in array
	int arr[5];
	int brr[5];
	
	for(int i=0;i<5;i++){
		scanf("%d",&arr[i]);
	}
	printf("enter a second array");
	for(int i=0;i<5;i++){
		scanf("%d",&brr[i]);
	}
		
		
	for(int i=0;i<5;i++){
		printf(" %d ",arr[i]);

		}printf("\n");
		for(int i=0;i<5;i++){
		printf(" %d ",brr[i]);

		}
	
	for(int i=0;i<5;i++){
	for(int j=0;j<5;j++){
	   if(arr[i]==brr[j]) {
	   	printf(" %d ",arr[i]);
	   	break;
	   }

		}

		}
	
	}