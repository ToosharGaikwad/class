
//.Count the frequency of each element in an array.
//Input: {1, 2, 2, 3, 3, 3, 4}
//Output: 1 ? 1 time, 2 ? 2 times, 3 ? 3 times, 4 ? 1 time
#include<stdio.h>
void countElement();

void main(){
	countElement();
}

void countElement(){
	int i,j;
	int freq[100];
	int arr[] = {1,1,2,2,3,3,3,31,2,4,4};
	int size = sizeof(arr)/sizeof(arr[0]);
	printf("%d",size);
	

//	for(i=0;i<(size);i++){
//		freq[i]=-1;
//		}
		
		for(i=0;i<size;i++){
			if(freq[i] == 0)
			continue;
//	 int count =1;
	for(int j=i+1;j<size;j++){
		if(arr[i]==arr[j]){
			count++;
			freq[j]= 0;
			
				}
		 
	}
	freq[i] = count;
    }
    for(i=0;i<size;i++){
    	if(freq[i]!=0){
    //	printf("frequncy of %d is %d  %s times ",arr[i],count,freq[i]);
         printf("frequency of %d is %d time%s\n", arr[i], freq[i], freq[i] > 1 ? "s" : "");

	}
	}
    }





































