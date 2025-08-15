#include<stdio.h>
typedef struct student{
	int rollno;
	char name[20];
    int	marks ;
}student;


		void adddata(student sarr[], int size);
        void display(student sarr[], int size );



void main(){
  student sarr[5];
 
 	adddata( sarr,5);
	display( sarr, 5);
	
}


void adddata(student sarr[],int size){
	 
	for(int i=0;i<size;i++){
		printf("Enter a roll no name and marks");
		scanf("%d %s %d",&sarr[i].rollno,sarr[i].name,&sarr[i].marks);
		
	}
}
 void display(student sarr[],int size){
 	for(int i=0;i<size;i++){
		printf("rollno = %d : name = %s : marks = %d\n",sarr[i].rollno,sarr[i].name,sarr[i].marks);
	
		
	}
 }