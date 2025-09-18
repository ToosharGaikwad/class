

void main(){
	int arr[]={1,3,4};
	int size = sizeof(arr)/sizeof(int);
	for(int i=0;i<size/2;i++){
	 int temp;
		
		temp = arr[size -1-i];
		arr[size - 1 - i] = arr[i];
		arr[i]=temp;
	
	}
	for(int i=0;i<size;i++){
		printf(" %d ",arr[i]);
	}
}