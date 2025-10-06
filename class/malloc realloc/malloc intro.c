 #include<stdio.h>
#include<stdlib.h>
void createArray(int*);
int inseartEle(int*,int* size);
void main(){
	int size = 5;
	int* arr=(int*) malloc(sizeof(int)*10);
	createArray(arr);
	 inseartEle(*arr,&size);
}   
    
	int i=0;
    int no;


void createArray(int* arr){
	int i=0;

	for(i=0;i<5;i++){
		scanf("%d ",&arr[i]);
	}
	for( i=0;i<5;i++){
		printf("%d  ",arr[i]);
	}
}

int inseartEle(int* arr,int* size){
		printf("Enter a number YOu want to inseart ");
		scanf("%d",&no);
		arr[*size] =no;
		(size++);
		
		
	for( i=0;i<500;i++){
	
		printf("%d \n ",arr[i]);
	    
//	  int ptr = realloc(int)sizeof(int)*15;
	}
	     free(arr);
		printf("end here");
}
   
//   // realloc in main  
//#include <stdio.h>
//#include <stdlib.h>
//
//void createArray(int* arr);
//int insertEle(int* arr, int* size);
//
//int main() {
//    
//    int* arr =malloc(sizeof(int) * 5);
//    for(int i=0;i<5;i++){
//    scanf("%d",&arr[i]);
//	}
//	for(int i=0;i<5;i++){
//    printf("%d ",arr[i]);
//	}
	
	// enter new size

//    int newsize = sizeof(int)*10;
//    
//    arr = realloc(arr,newsize);
//    for(int i=5;i<newsize;i++){
//    	scanf("%d",&arr[i]);
//	}
//		for(int i=5;i<newsize;i++){
//    printf("%d ",arr[i]);
//	}
//}

//
//void inseartEle(int*,int*,int );
//void createArray(n);
//void storeArray(int,int);
//void main(){
//	int n =10;
//	int* arr = createArray(n);
//	storeArray(arr,8);
//	inseartEle(arr,&n,12);
//}
//void inseartEle(int* arr,int* n,int ele){
//	for(int i=0;i<n;i++){
//		printf("%d",arr[i]);
//	}
//		
//	arr[*n] = ele;
//	(*n)++;
//}
//void createArray(){
//	int* arr = malloc(sizeof(int)*15);
//	return arr;
//}
//void storeArray(int* arr,5){
//	for(int i=0;i<size;i++){
//		scanf("%d"&arr[i]);
//	}
//}













