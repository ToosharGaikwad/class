#include<stdio.h>

void main(){
//	int a,b;
//	
//	printf("enter two numbers  ");
//	
//	scanf("%d %d",&a,&b);
//	int c = a+b;
//	int sub = a-b;
//	int div = a/b;
//	int mul = a*b;
//	int mod = a%b;
//	printf("addition of %d and %d is %d\n", a, b, c);
//		printf("subtraction of %d and %d is %d\n", a, b, sub);
//			printf("multification of %d and %d is %d\n", a, b, mul);
//				printf("division of %d and %d is %\n", a, b, div);
//					printf("mod of %d and %d is %d\n", a, b, mod);
	
	
	
	//check the trangle is  equlateral isosceles or scalene
	
//	int s1,s2,s3;
//	scanf("%d %d %d",&s1,&s2,&s3);
//	
//	if(s1==s2&&s1==s3)
//	   printf("trangle is equvilateral");
//	else if(s1==s2||s2==s3||s3==s1 )
//	   printf("trangle is isosceles ");
//	else
//	    printf("trangle is sceles ");
//	
	
	
	// find the number is greater
	
//		int a =85,b= 21,c=42;
//	if(a>b&&a>c){
//		printf("a is greter");
//	}
//	else if(b>a&&b>c){
//		printf("b is greter" );
//		
//	}else if(c>a&&c>b){
//		printf("c is greter" );
//
//	}
	
	
	// check the marks with there percentage
	
//	int marks;
//	printf("enter the marks  ");
//	scanf("%d",&marks);
//	
//	if(marks>75&&marks<100)
//	     printf("Distinction");
//	else if(marks<75&&marks>65)
//        printf("Frist class");
//	else if(marks<65&&marks>55)
//	    printf("Second class");
//	else if(marks>=40&&marks<55)
//	    printf("Pass") ;
//    else if(marks <40&&marks>1)
//        printf("Fail");	   
//    else
//    printf("please enter valid marks");	   

	
	//discount on purchaging
	
	
     float price,discount=0.0f;
	char isstudent;
    printf("enter price");
    
	scanf("%f",&price);
	
	printf("if you student y or n   ");
	scanf("%c  ",&isstudent);
	
	
	if(isstudent=='y'||isstudent=='Y'){
		 if(price>=500){
			if(price>=500)
			discount=0.20f;
			else
			discount=0.10f;
			}
		}else if(isstudent=='n'||isstudent=='N'){
			if(price>=600){
				discount=0.15f;
		}
		else
		discount = 0.0;
		}

//if (isStudent == 'y' || isStudent == 'Y') {
//        discount = (price >= 500) ? 0.20f : 0.10f;          
//    } else if (isStudent == 'n' || isStudent == 'N') {
//        discount = (price >= 600) ? 0.15f : 0.0f;           
//    } else {
//        puts("Invalid choice – assuming no discount.");
//    }
//	
	
	
	 
	 
	 // accept the number from user and check divisible by 3 5 or not 
	 
//	 int no ;
//	 
//	 scanf("%d",&no);
//	
//     if(no%3==0&&no%5==0)
//        printf("both are divisible");
//     else if(no%3==0)
//        printf("number divisible by 3");
//    else if(no%5==0)
//        printf("number divisible by 5");
//    else 
//        printf("number not divisible by 3 or 5");

	
//	   check a person is teen adult child or sinior

//  int age;
//  printf("please enter a age");
//  
//  scanf("%d",&age);
//    
//    if(age >=20&&age<=59)
//        printf("Adult");
//    else if(age >= 60&&age<100)
//        printf("sinior citizen");
//	else if(age>=12&&age<=19)
//	    printf("teenager");
//	
//		
//	
	
	
	
	
	
	
	
	
	
	
	
}