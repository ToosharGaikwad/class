
#include<stdio.h>
void storeArray(int*,int);
void displayArray(int*,int);
void replaseArray(int*,int,int,int);
void main(){
	int arr[10];
storeArray(arr,10);
displayArray(arr,10);
replaseArray(arr,10,7,5);
displayArray(arr,10);
}

 void storeArray(int *ptr ,int size){

for(int i=0;i<10;i++){
	scanf("%d",&ptr[i]);
	}

}

void displayArray(int *ptr,int size){
	for(int i=0;i<size;i++){
		printf("%d",ptr[i]);
	}
}
void replaseArray(int *ptr,int size ,int newvalue,int oldvalue){
	
	for(int i=0;i<size;i++){
		int arr[i];
		if(arr[i]==5){
			arr[i]=7;
		}
	}
}




