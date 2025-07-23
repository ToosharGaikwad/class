#include<stdio.h>
void main(){

	// get amount from user and count a notes
	
	
	int count;
	int amount;
	printf("enter a amount  ");
 	scanf("%d ",&amount);
	int notes[9]={500,200,100,50,20,10,5,2,1};
	
	for (int i=0;i<9;i++){
	    count = amount/notes[i];
	    	
	    if(count>0){
	    	printf("\n %d %d ",count ,notes[i]);
	    	amount = amount - notes[i] * count;
		}
	}
	 	}

 
 
