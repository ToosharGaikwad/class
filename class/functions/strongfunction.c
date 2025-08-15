 //check the given number is strong or not
 
 #include<stdio.h>
void strongnum(int fd  ,int ld);
void main(){
	int fd,ld;


		printf("enter a range of numbers");
		scanf("%d %d",&fd,&ld);

	strongnum(fd,ld);
	
	
}

		void strongnum(int fd,int ld){
		int r;
		for(int i=fd;i<=ld;i++){
		int	temp=i;

         int sum=0;
		while(temp>0){
		  
		r=temp%10;
		int fact = 1;
		for(int j=1;j<=r;j++){
			
			fact=fact*j;
		//	printf(" %d   ",fact);
		}
		sum=sum+fact;
		temp=temp/10;	
		//printf(" %d ",sum);
		}
//
		if(sum==i)
		printf("is strong number %d   ",i);
		
		}

}





