//#include<stdio.h>
//void greternum();
//void main(){
//greternum();
//
//}
//
//
//
//greternum(){
//	int a =85,b= 21,c=42;
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
//	
//}



//#include<stdio.h>
//void greternum();
//void main(){
//greternum();
//
//}
//
//
//
//greternum(){
//	int a =85,b= 21,c=42;
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
//	
//}





//#include<stdio.h>
//void greternum();
//void main(){
//greternum();
//
//}
//
//
//
//greternum(){
//	int a =85,b= 21,c=42;
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
//	
//}





#include<stdio.h>
int greternum();
int main(){
int res = greternum();
if(res==1)
   printf("a is greter");
   else if(res==2)
   	 printf("b is greter");
   else if(res==3)
   	 printf("c is greter");

   
}



int greternum(){
	int a ,b,c;
	printf("enter a number");
	scanf("%d %d %d",&a,&b,&c);
	if(a>b&&a>c){
		return 1;
	}
	else if(b>a&&b>c){
		return 2;
		
	}else if(c>a&&c>b){
		return 3;

	}
	
}







