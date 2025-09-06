 // remove the value of odd index

#include<stdio.h>

void main(){
	int arr[] = {1,3,4,5,6,7,8,9,10};
	int size = sizeof(arr)/sizeof(int);
	 int remove = removeodd(arr,size);
	for(int i = 0;i<remove;i++){
		printf("%d ",arr[i]);
	}
	
}

int removeodd(int* arr,int* size){
	int j=0;
	for(int i=0;i<size;i++){	
		
		if(i%2==0){
		arr[j] = arr[i];
	      j++;
		
		}
		
	}
	return j;
}