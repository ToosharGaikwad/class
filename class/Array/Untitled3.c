void main(){
	int arr[]={3,2,5,7,9,22,23,13};
	int size = sizeof(arr)/sizeof(int);

	
	for(int i=0;i<size;i++){
		int flag =0;
		for(int j=2;j<size/2;j++){
	
			
				if(arr[i]%j==0){
					flag=1;
					break;
				} 
		}
		if(flag==1){
		printf("no is prime %d ",arr[i]);

	
	
	}
	
		}
		
	
	
	
}