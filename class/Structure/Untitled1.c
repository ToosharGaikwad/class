#include<stdio.h>
void main(){
int arr[] = {2,3,4,5,6,8,9,10,11,13,15,17,20,21,23};

int  size = sizeof(arr)/sizeof(int);


for(int i=0;i<size;i++){
	int flag = 0;	
for(int j=2;j<size/2;j++){
		if(arr[i]%j==0){
		flag =1;
		break;
	}	
}
     if(flag==0){
		printf("number is Prime %d" ,arr[i]);
	}	
}
}