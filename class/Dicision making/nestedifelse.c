#include <stdio.h>
void main(){
//	int a =23,b= 21,c=42;
//	if(a>b||a>c){
//		printf("a is greter");
//	}
//	else if(b>a||b>c){
//		printf("b is greter" );
//		
//	}else if(c>a||c>b){
//		printf("c is greter" );
//
//	}





// number is positive or negative
	
//	int no ;
//	   printf("enter a number");
//	scanf("%d",&no);
//	  if(no ==0){
//		printf("number is zero");
//		
//	 }else if(no<0){
//		printf("number is negative");
//		
//	}else if(no>0){
//		printf("number is positive");
//		
//	}




// check vowel consonants or special characters
	
	
		char ch ;
	printf("enter a character  :");
	scanf("%c",&ch);
	
	if(ch =='a'|| ch =='e'|| ch =='i'|| ch =='o'|| ch =='u'){
		printf("characrer is vowel");
		
	 }else if(ch>='a' && ch<='z' || ch>='A'&& ch<='Z'){
		printf("character is consonant");
		
	}else if(ch>='0' && ch<='9'){
		printf("character is digit");
	
	}else
	printf("character is special character");
	
	
	
	int no = 8;
	   no%2==0?printf("even"):printf("odd");
	
	
	
	
	
	
	
}