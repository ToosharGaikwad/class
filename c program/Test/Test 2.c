#include<Stdio.h>
  //get input of range from user and print a factors
//  void main(){
//    int start,end;
//	scanf("%d %d",&start,&end);
//	
//	for(int i=start;i<end;i++){
//		printf("\n The factor of  %d is  ",i);
//		for(int j=1;j<i;j++){
//				
//			if( i%j==0){
//		
//				printf("%d ",j);
//			}
//	}
//	}
//}


// get a number and print a power of number 
void powof();
void main(){
    
  powof();
}

void powof(){

   int no ,ex,res;
   printf("Enter a number");
	scanf("%d %d ",&no,&ex);
	for(int i=1;i<=ex;i++){
		res=res*no;
		
	}
	printf("%d",res);

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	