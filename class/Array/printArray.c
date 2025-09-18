//
#include<stdio.h>
// take a input and print array
void main(){
//int arr[5];
//for(int i=0;i<5;i++){
//
//scanf("%d",&arr[i]);
//
//}
//for(int i=0;i<5;i++){
//
//printf("%d",arr[i]);
//
//}
//}
//
//
//
//// print maximum or minimum number 
//
//
//void main() {
//	int arr[5];
//	int max ;
//	int min;
//	
//	for( int i=0; i<5; i++) {
//
//		scanf("%d",&arr[i]);
//
//	  }
//		for(int i=0; i<5; i++) {
//
//			printf("%d  ",arr[i]);
//
//		}
//          max = arr[0];
//	   	  min = arr[0];
//			for(int i=0;i<5;i++){
//			    	if(arr[i]>max){
//			    		max=arr[i];
//					}
//			
//				}
//				printf(" \n");
//				printf(" the max number is %d \n",max);
//				
//				for(int i=0;i<5;i++){
//	        		if(arr[i]<min){
//	    			min=arr[i];
//				}
////			}
//				printf(" \n");
//				printf("Min number is %d \n",min);
//
//	}
//		
//
//
//
//
//// search a given number in array
////
//void main(){
//	int arr[10];
//	for(int i=0;i<10;i++){
//		scanf("%d",&arr);
//    
//    	
//	}
//	int num;
//    printf("Enter number You want to search  ");
//    	scanf("%d",&num);
//    		
//	for(int i=0;i<10;i++){
//    	if(num==arr[i]){
//    		printf("the num is awailable in this array %d",num);
//		}
//	}
//
//    
//}
//
//
//
//
//// sum of all numbers in array
//
//void main(){
//	int arr[10];
//	for(int i=0;i<10;i++){
//		scanf("%d",&arr[i]);
//    
//    	
//	}
//	int sum=0;
//	for(int i=0;i<10;i++){
//		sum=sum+arr[i];
//		
//	}
//   printf("%d",sum);
//	}
//
//
//
//
//// find odd and even in the array
//
//void main(){
//	int arr[10];
//	for(int i=0;i<10;i++){
//		scanf("%d",&arr[i]);
//	}
//	
//	for(int i=0;i<10;i++){
//		if(arr[i]%2==0){
//			printf("%d The number is even \n",arr[i]);
//		}
//		else{
//		printf("%d The number is odd \n",arr[i]);
//	
//		}
//		
//	}
//  
//	}
//
//
//
//
//
////  print alternate element of array
//
//void main(){
//	int arr[10];
//	for(int i=0;i<10;i++){
//		scanf("%d",&arr[i]);
//	}
//	
//	for(int i=0;i<10;i++){
//	    if(i%2!=0)
//			printf(" The alternate number is %d  \n",arr[i]);
//	
//		
//	}
//  
//	}
//
//
//
////  Accept the array and print only prime numbers only
//
//
//
//
//void main(){
//	int arr[10];
//	for(int i=0;i<10;i++){
//		scanf("%d",&arr[i]);
//	
//
//
//for(int j=2;i<arr[i];j++){
//	
//	if(arr[i]%2!=0){
//		printf("number is prime %d",arr[i]);
//	}
//   break;
//		}
//}
//}
//
//

/////////////below code is not complited
//
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
//


// sum of two array


//int arr[]={1,2,3,4,5,6,7,8};
//int brr[]={10,20,30,40,50,60,70,80};
//int crr[8];
//for(int i=0;i<8;i++){
//	crr[i]=arr[i]+brr[i];
//}
// for(int i = 0; i < 8; i++) {
//        printf("%d ", crr[i]);
//    }
//  


// merge two array 
//int arr[]={1,2,3,4,5,6,7,8};
//int brr[]={10,20,30,40,50,60,70,80};
void mergeArray()

     void main(){
		mergeArray();	
	}

void mergeArray(){
	
		
		int* arr=(int*)malloc(sizeof(int)*8);
		int* brr=(int*)malloc(sizeof(int)*8);


if (arr == NULL || brr == NULL) {
        printf("Memory allocation failed\n");
        return;
    }
		    for(int i=0;i<8;i++){
		    arr[i]=i+1;
			}
			 for(int j=0;j<8;j++){
		    brr[i]=i+1*10;
			}

			int size = sizeof(arr)/sizeof(arr[0]);
			int size1 = sizeof(brr)/sizeof(arr[0]);
  
		  int crr[size+size1];
		  int i=0,j=0,k=0;
		  
		  while(i<size){
		  crr[k++] = arr[i++];	
		  }	
		  
		  
		  while(j<size1){
		  crr[k++] = brr[j++];	
		  }	
   
	
    	for(int x = 0; x < size + size1; x++) {
            printf("Merged = %d\n", crr[x]);
    free(arr);
    free(brr);
    free(crr);
}  
}



