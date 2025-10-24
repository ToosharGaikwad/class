void main(){
	for(int i=0;i<40;i++)
	{if(i==20){
			printf("00");
			i++;
	}else
		printf("*");
	}
		
		
		for(int j=0;j<5;j++){
		
	for(int i=0;i<21;i++){
		if(i==20){
				printf("00");
				printf("\n");
		}else{
			printf(" ");
		}
		
	}
	}
	
	for(int i=0;i<5;i++){
		for(int j=0;j<10;j++){
			printf(" ");
		}
		for(int j=0;j<20;j++){
			printf("*");
		}
		printf("\n");
	}
		
	for(int i=0;i<7;i++){
			
		
		for(int j=0;j<37;j++){
     	if(i+j==8||j-i==30){    		
     			printf("*");
     		
		 }else{
		 	printf(" ");
		 }
			
	}
	 printf("\n");
	}
	printf(" ");

	
	
	for(int i=0;i<5; i++){
		for(int j=0;j<20;j++){
	
		if(j==1 ){
			printf("*");
				}else if(j==19){
					printf("-");
				}
				else if( j>0&&i==4){
					printf("-^");
				}
				else if( j>0&&i==0){
					printf("-^");
				}
				else {
					printf("  ");
				}		
	}
	printf("\n");	
  }

for(int i=0;i<7;i++){
	for(int j=0;j<31;j++){
		if(i==j)
		printf("*");
		if(i+j==17)
		printf("*");
		else
		printf("  ");
	}
	printf("\n");
}

for(int i=0;i<5;i++){
	for(int j=0;j<25;j++){
		if(j>10)
		printf("*");
		else 
		printf(" ");
	

}
	printf("\n");
}
for(int i=0;i<8;i++){
	for(int j=0;j<22;j++){
		if(j>10&&j%2==0)
		printf("0 ");
		else
		printf(" ");
}
printf("\n");
}



}
