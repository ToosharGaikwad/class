#include<stdio.h>
typedef struct student{
	int rollno;
	char name[20];
    int	marks ;
}student;


		void adddata(student sarr[], int size);
        void display(student sarr[], int size );
     	int deletestudent(student sarr[],int* size,int rn);
		int search(student sarr[],int size,int rn);
		

void main(){
  student sarr[2];
    int size =2;
    int rn;
 	adddata( sarr,size);
	display( sarr, size);
	printf("Enter a roll no You want to search");
	scanf("%d",&rn);
     int result = search(sarr,size, rn);
    
    if(result==1){
    	printf("roll no of stundent is awailable %d ",rn);
	}else {
		printf("roll no of  student is not awailable%d ",rn);
	}
	
	printf("Enter a roll no You want delete ");
 	scanf("%d",&rn);
 	
 	
	int deleted = deletestudent(sarr,&size, rn);
	if(deleted==1){
      printf("Student with roll number %d deleted.\n", rn);
      display( sarr, size);
	}
	
	
    
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
 
 
    int search(student sarr[],int size,int rn){
 	
 	for(int i=0;i<size;i++){
 	if(sarr[i].rollno==rn){
 		return 1;
	 }	
	 }
	 	return -1;
 }
 
 int deletestudent(student sarr[],int* size,int rn){
 	int flag =0;
 for(int i=0;i<*size;i++){
 	
	if(sarr[i].rollno==rn){
		
		for(int j=i;j<*size-1;j++){
		sarr[j] = sarr[j+1];
		flag =1;
		
	
		
	}
	printf("%d",i);
	(*size)--;
    return 1;
   
}
}
  
}