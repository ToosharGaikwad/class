#include<stdio.h>
// create a array of employee store and display with loop
typedef struct employee{
int	id;
char name[15];
int	salary;
} employee;

void main(){
   employee Earr[4];
   
   for(int i=0;i<4;i++){
   	printf("Enter id name and salary");
   scanf("%d %s %d",&Earr[i].id,Earr[i].name,&Earr[i].salary);

	 }
	 for(int i=0;i<4;i++){
	 
	 printf("%d %s %d",Earr [i].id,Earr[i].name,Earr[i].salary);
}

	
	
	
}