
#include<stdio.h>
typedef struct distance{
	int feet;
	int inch;
}distance;


void addDist(distance caldist[],int size);
void display(distance caldist[], int size); 
  
void main(){
 distance caldist[5];
 addDist(caldist, 5);
 display(caldist, 5);	
	
}


void addDist(distance caldist[],int size){
	 
	for(int i=0;i<size;i++){
		printf("Enter a inch and feet to calculate addition");
		scanf("%d %d",&caldist[i].inch,&caldist[i].feet);
	    
	    
	    if (caldist[i].inch >= 12) {
            caldist[i].feet += caldist[i].inch / 12;
            caldist[i].inch = caldist[i].inch % 12;
        }
	}	
}


void display(distance caldist[], int size) {
    for (int i = 0; i < size; i++) {
        printf("Distance %d: %d feet %d inches\n", i + 1, caldist[i].feet, caldist[i].inch);
    }
	
}






