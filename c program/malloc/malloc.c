
#include<stdio.h>
#include<stdlib.h>
	void mymalloc();
void main(){
	mymalloc();
}
void mymalloc(){

//			int* arr=(int*)malloc(sizeof(int)*10);
//			int* brr=(int*)malloc(sizeof(int)*10);
//			int* crr=(int*)malloc(sizeof(int)*20);
			int size,size1;
				printf("Enter a the size for first array ");
				scanf("%d ",&size);
				
			
			printf("Enter a value for frist array ");
			
		    for (int i=0;i<size;i++){
		    	scanf("%d",&arr[i]);
			}
			for (int i=0;i<size;i++){
		    	printf("%d ",arr[i]);
			}
			
					printf("Enter a the size for second array ");
				scanf("%d ",&size1);
			
				printf("\n Enter a value for second array ");
			for (int i=0;i<size1;i++){
		    	scanf("%d",&brr[i]);
			}
			for (int i=0;i<size1;i++){
		    	printf("%d",brr[i]);
			}

			 //           -||-                 arr{1,2,3,4,5,6,7,8};
			//  can not allocate like this int brr[]={10,20,30,40,50,60,70,80};
			
//			arr[0]=1;
//			arr[1]=10;
//			arr[2]=20;
//			arr[3]=30;
//            
//            brr[0]=40;
//			brr[1]=50;
//			brr[2]=60;
//			brr[3]=70;
				 // int crr[size+size1];
				  int i=0,j=0,k=0;
			  
				  while(i<size){
				  crr[k++] = arr[i++];	
			  		}	
			  
			  
					while(j<size1){
					crr[k++] = brr[j++];	
					}
					  	for(int x = 0; x < size + size1; x++) {
					    printf("Merged = %d\n", crr[x]);
					}
			  
  }