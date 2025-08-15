#include<stdio.h>

// Add Complex (real, imaginary) number;
typedef struct complex{
	int real;
	int img;
}complex;

storeComplex( complex arr,int size);
void main(){
	
	 complex arr[2];
	 void storeComplex( arr, 2);	
	complex result = addcomplex(arr,2);	
	
}



	void storeComplex(complex arr[],int size){
		   for(int i=0;i<size;i++){
		   	scanf(" %d %di",&arr[i].real,&arr[i].img);
		   
		   
		  
      }
	}


complex addcomplex(complex arr[],int size){
	
complex result = {0, 0};
    for (int i = 0; i < size; i++) {
        result.real += arr[i].real;
        result.img += arr[i].img;
    }
}





