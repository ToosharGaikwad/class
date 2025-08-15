// prime number  array with malloc
  void prime();
  void main(){
	prime();
}
prime(){

int* arr=(int*)malloc(sizeof(int)*10);
	for(int i=0;i<10;i++){
		scanf("%d",&arr[i]);
	
for(int j=2;i<arr[i];j++){
	
	if(arr[i]%2==0){
		printf("number is prime %d",arr[i]);
	}
   break;
		}
		
}
free(arr);
}