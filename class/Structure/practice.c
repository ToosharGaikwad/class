#include<stdio.h>
// create a array of employee store and display with loop
typedef struct employee{
int	id;
char name[15];
int	salary;
} employee;

void main(){
//   employee Earr1[] = {1,"ff",5};
   
//   for(int i=0;i<4;i++){
//   	printf("Enter id name and salary");
//   scanf("%d %s %d",&Earr[i].id,Earr[i].name,&Earr[i].salary);
//
//	 }
//	 for(int i=0;i<4;i++){
//	 
//	 printf("%d %s %d",Earr [i].id,Earr[i].name,Earr[i].salary);
//}


	// add two array
	 employee Earr1[] = {1,"ff",5};
	employee Earr2[] = {32,"lll",3};
	
    int size = sizeof(Earr1) / sizeof(Earr1[0]);

for(int i=0;i<size;i++){
	employee earr[i] = Earr1[i].id+Earr2[i].id;
	}
	
	
	
}