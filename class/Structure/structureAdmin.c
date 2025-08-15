#include<string.h>
#include<stdio.h>
//struct Admin{
//	int id;
//	char name[20];
//	int salary;
//	int allowance;
//};

//void main(){
//	
//	struct Admin a1,a2;
//	a1.id = 302;
//	strcpy(a1.name,"ranjeet"); 
//	a1.allowance =23;
//	a1.salary = 50600;
//	
//	printf("%d %s %d %d",a1.id,a1.name,a1.allowance,a1.salary);
//	
//}


//
//
//struct Admin{
//	int id;
//	char name[20];
//	int salary;
//	int allowance;
//};

//void main(){
//	
//	struct Admin a1,a2,a3;
//	printf("Enter the Id : Name: salary : allowance for a1");
//	scanf("%d %s %d %d",&a1.id,&a1.name,&a1.salary,&a1.allowance);
//	printf("Enter the Id : Name: salary : allowance for a2");
//	scanf("%d %s %d %d",&a2.id,&a2.name,&a2.salary,&a2.allowance);
//    printf("Enter the Id : Name: salary : allowance for a3");
//	scanf("%d %s %d %d",&a3.id,&a3.name,&a3.salary,&a3.allowance);
//
//	
//	printf("%d %s %d %d\n",a1.id,a1.name,a1.allowance,a1.salary);
//	printf("%d %s %d %d\n",a2.id,a2.name,a2.allowance,a2.salary);
//	printf("%d %s %d %d\n",a3.id,a3.name,a3.allowance,a3.salary);
//	
//}



struct Admin{
	int id;
	char name[20];
	int salary;
	int allowance;
};

struct Admin storeinfo(){
	struct Admin emp;
	printf("Enter a id  name allowance and salary\n");
	scanf("%d %s %d %d",&emp.id,emp.name,&emp.allowance,&emp.salary);
	return emp; 
}

 void display(struct Admin empl){
	printf("%d %s %d %d \n",empl.id,empl.name,empl.allowance,empl.salary);
  return empl;
}

void main(){
	
	struct Admin Employee1,Employee2,Employee3;
     Employee1 =storeinfo();
     Employee2 =storeinfo();
     Employee3 =storeinfo();
     
      display(Employee1);
      display(Employee2);
      display(Employee3);
	
	
}

















