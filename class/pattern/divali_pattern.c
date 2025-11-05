void main(){
	for(int i=0;i<40;i++)
	{if(i==20&&i<21){
			printf("00");
//			i++;
	}else
		printf("*");
	}
printf("\n");
		
	for(int j = 0; j < 5; j++) {
        for(int i = 0; i < 20; i++) {
            printf(" ");
        }
        printf("00\n");
    }

	
	
	for(int i=0;i<5;i++){
		for(int m=0;m<10;m++){
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
//	printf(" ");

//	printf("*");
	
	for(int i=0;i<5; i++){
		for(int j=0;j<20;j++){
	
		if(j==1){
			printf("2");
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
			if(j<1)
	   			printf("  ");
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
		if(j>13)
		printf("*");
		else 
		printf(" ");
	

}
	printf("\n");
}
for(int i=0;i<5;i++){
	for(int j=0;j<22;j++){
		if(j>12&&j%2==0)
		printf("0 ");
		else
		printf(" ");
}
printf("\n");
}



}
//	else if( j<7&&j>5&&i==2){
//					printf("happy diwali");
//					break;
//				}	