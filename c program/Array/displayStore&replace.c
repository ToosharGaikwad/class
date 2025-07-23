

#include<stdio.h>
void replaseArray(int *arr,int size,int old,int new);
void storeArray(int *arr,int size);
void displayArray(int *arr,int size);	
void main(){
	    int arr[10];
	    
		 storeArray(arr,10);
		 
		 replaseArray(arr,10,3,0);
		 displayArray(arr,10);
}


	void storeArray(int *arr,int size){
	    
		for(int i=0;i<10;i++){
			scanf("%d",& arr[i]);
			
		}
	}
		void displayArray(int *arr,int size){
	   
		for(int i=0;i<10;i++){
		printf(" %d " , arr[i]);
			
		}
	}
	
	 void replaseArray(int *arr,int size,int old,int new){ 
	 		for(int i=0;i<10;i++){
	 			if(arr[i]==old){
	 				arr[i]=new;
	 				
				 }
				 	printf(" %d " , arr[i]);
		}
		printf("\n");
	}  
	